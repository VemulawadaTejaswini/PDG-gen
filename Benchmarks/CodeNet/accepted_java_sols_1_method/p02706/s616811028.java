import java.util.*;

public class Main{
    public static void main(String[] args){
        Long N, M, result;
        Scanner sc = new Scanner(System.in);
        N =sc.nextLong();
        M =sc.nextLong();
        result = N;
        ArrayList<Long> studyDays = new ArrayList<Long>();
        for(int i = 0; i < M; i ++){
            studyDays.add(sc.nextLong());
            result -= studyDays.get(i);
        }
        if(result < 0){
            System.out.println("-1");    
        }else{
            System.out.println(result);
        }
    }
}

