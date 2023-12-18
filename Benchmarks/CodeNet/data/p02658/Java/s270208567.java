
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long max = (long)Math.pow(10,18);
        long sum =1;

        for(int i=0;i<n;i++){
            long a = scn.nextLong();
            if(a==0){
                System.out.println(0);
                break;
            }else if(a>max){
                System.out.println(-1);
                break;
            }else{
                sum = sum*a;
                if(sum>max||sum<0){
                    System.out.println(-1);
                    break;
                }
            }
            if(i==n-1) {


                System.out.print(sum);
            }
        }


        scn.close();


    }


}