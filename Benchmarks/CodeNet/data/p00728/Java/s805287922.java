import java.awt.print.Printable;
import java.util.Arrays;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;
  
public class Main{      
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<20;i++){
            int n = sc.nextInt();
            if(n>2){
            int points[] = new int[n];

            for(int j=0;j<n;j++){
                points[j]=sc.nextInt();
            }
            Arrays.sort(points);
        
            points[0]=0;
            points[n-1]=0;

            double sum=0.0;
            double ave=0.0;
            for(int j=0;j<n;j++){
                sum += points[j];
            }
            ave = sum/(double)(n-2);

            int ave2 = (int)Math.floor(ave);

            System.out.println(ave2);
        }
        
        }
        sc.close();
        
    }   
}
