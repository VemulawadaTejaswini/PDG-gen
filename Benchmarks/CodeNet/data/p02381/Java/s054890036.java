import java.awt.print.Printable;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;
import java.math;
  
public class Main{      
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(true){
        int n = sc.nextInt();
        if(n==0)
            break;
        int scores[]=new scores[n];
        int sum=0;
        double ave=0.0;
        double div=0.0;
        for(int i=0;i<n;i++){
            scores[i]=sc.nextInt();
            sum+=scores[i];
        }
        ave = (double)sum/(double)n;

        for(int i=0;i<n;i++){
            div += pow(scores[i]-ave,2)/n;
        }

        System.out.println(ave);
     }
        sc.close();
        
    }   
}
