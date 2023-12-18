
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long sum = scn.nextLong();
        long max = (long)Math.pow(10,18);
        
        for(int i=1;i<n;i++){
            long a = scn.nextLong();
            sum = sum*a;
        }
        if(sum>max){
            System.out.println(-1);
        }else{
            System.out.println(sum);
        }

    scn.close();


    }


}