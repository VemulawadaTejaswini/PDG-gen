import java.util.Arrays;
import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int N, M, r, q, temp, time1, answer;
        Record[] records;
        Question[] questions;
        boolean[] check;
        while((N = sc.nextInt()) != 0 | (M = sc.nextInt()) != 0){
            r = sc.nextInt();
            records = new Record[r];
            for(int i = 0; i < r; i++) records[i] = new Record(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            q = sc.nextInt();
            questions = new Question[q];
            for(int i = 0; i < q; i++) questions[i] = new Question(sc.nextInt(), sc.nextInt(), sc.nextInt());

            for(Question Q : questions){
                check = new boolean[N];
                Arrays.fill(check, false);
                time1 = 0;
                temp = 0;
                answer = 0;
                for(; temp < r && records[temp].time <= Q.from_time; temp++){
                    if(records[temp].ST_ID == Q.ST_ID){
                        if(records[temp].log == 1) check[records[temp].PC_ID - 1] = true;
                        else check[records[temp].PC_ID - 1] = false;
                    }
                }
                if(totalCheck(check)) time1 = Q.from_time;
                for(; temp < r && records[temp].time <= Q.to_time; temp++){
                    if(records[temp].ST_ID == Q.ST_ID){
                        if(records[temp].log == 1) check[records[temp].PC_ID - 1] = true;
                        else check[records[temp].PC_ID - 1] = false;
                        if(totalCheck(check)){
                            if(time1 != 0) continue;
                            else time1 = records[temp].time;
                        }else{
                            answer += records[temp].time - time1;
                            time1 = 0;
                        }
                    }
                }
                if(totalCheck(check)) answer += Q.to_time - time1;
                System.out.println(answer);
            }
        }
    }

    static boolean totalCheck(boolean[] check){
        boolean total_check = false;
        for(boolean b : check) total_check |= b;
        return total_check;
    }


    static class Record{
        int time, PC_ID, ST_ID, log;

        Record(int time, int PC_ID, int ST_ID, int log){
            this.time = time;
            this.PC_ID = PC_ID;
            this.ST_ID = ST_ID;
            this.log = log;
        }
    }

    static class Question{
        int from_time, to_time, ST_ID;

        Question(int from_time, int to_time, int ST_ID){
            this.from_time = from_time;
            this.to_time = to_time;
            this.ST_ID = ST_ID;
        }
    }
}