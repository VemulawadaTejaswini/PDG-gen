import java.util.Scanner;

public class Main{ 
        public static void main(String[] args){
            int i,j=0,sum,count=0;
            double bunn;
            int b[];
            double c[];
            b = new int[1000];
            c = new double[1000];
                Scanner n = new Scanner(System.in);
                while(true){
                     int a = n.nextInt();
                     if(a==0){
                         break;
                     }
                     sum = 0;
                     bunn = 0;
                     for(i=0;i<a;i++){
                         b[i]=n.nextInt();
                         sum = sum + b[i];
                     }
                     double ave = (double)sum/a;
                     for(i=0;i<a;i++){
                         bunn = bunn +  (double)((b[i]-ave)*(b[i]-ave));
                     }
                     double sann = bunn/a;
                     c[j]  = Math.sqrt(sann);
                     j++;
                     count++;
                }
                i=0;
                while(i<count){
                     System.out.println(c[i]);
                     i++;
                }
        }
    }
