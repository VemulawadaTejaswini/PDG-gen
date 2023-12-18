import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);

        while(true){
           String line,line2;
           double m,a,disp,val;
           disp = 0;
           int sum=0;
           int s[]= new int[1000];
            line = scanner.next();
            int n = Integer.parseInt(line);

            if(n ==0){
                break;
            }

            
            for(int i =0;i < n;i++){
                line2 = scanner.next();
                s[i]= Integer.parseInt(line2);
                sum = sum + s[i];  
            }
            m = (double)sum/(double)n;
            for(int i = 0; i < n;i++){
                a = (s[i]-m)*(s[i]-m);
                disp = a+disp;
            }
            disp = disp/(double)n;
            val = Math.sqrt(disp);
            System.out.printf("%f\n",val);
            
        }

        }
    }



