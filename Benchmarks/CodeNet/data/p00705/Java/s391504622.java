import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    static Scanner s = new Scanner(System.in);
    static ArrayList<Meeting> list = new ArrayList<Meeting>();
    static class Meeting{
        int date;
        int num;

        Meeting(int date, int num) {
            this.date = date;
            this.num = num;
        }
    }
    static class Comparator1 implements Comparator<Meeting>{
        public int compare(Meeting a,Meeting b){
            return a.date-b.date;
        }
    }

    public static void main(String[] args) {
        while (true){
            int N = s.nextInt();
            int Q = s.nextInt();
            if(N==0 && Q==0) break;
            list.clear();

            for(int i=0;i<N;i++){
                int M = s.nextInt();
                for(int j=0;j<M;j++){
                    int date = s.nextInt();
                    addDate(date);
                }
            }
            Collections.sort(list, new Comparator1());

            printDate(Q,N);
        }
    }

    static void addDate(int date){
        for (int i = 0; i < list.size(); i++) {
            Meeting temp = list.get(i);
            if(temp.date==date){
                temp.num++;
                list.set(i,temp);
                return;
            }
        }
        list.add(new Meeting(date, 1));
    }
    
    static void printDate(int minNum,int maxNum){
        Meeting ans=list.get(0);
        for (int i = 1; i < list.size(); i++) {
            Meeting temp = list.get(i);
            if(ans.num==maxNum){
                System.out.println(ans.date);
                return;
            }
            if(ans.num<temp.num){
                ans=temp;
            }
        }
        if(ans.num>=minNum) {
            System.out.println(ans.date);
        }else{
            System.out.println("0");
        }
    }
}