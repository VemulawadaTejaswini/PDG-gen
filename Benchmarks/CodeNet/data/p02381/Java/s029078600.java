import java.util.Scanner;


public class Main{
    public static void main (String[]args){
    try(Scanner sc = new Scanner(System.in)){
        while (true) {

            int n = sc.nextInt();
            if (n==0)break;
            
            double ave=0;

            int[] scores = new int[n];
            for (int i = 0; i < scores.length;i++) {
                scores[i] = sc.nextInt();
                ave=ave+scores[i];
            }       
            ave=ave/n;
            double var=0;

            for (int i = 0; i < scores.length;i++) {
                var=var+(scores[i]-ave)*(scores[i]-ave);
            
            }
             var=var/n;
             var =Math.sqrt(var);

             System.out.println(var);
        }  
    }

}}
