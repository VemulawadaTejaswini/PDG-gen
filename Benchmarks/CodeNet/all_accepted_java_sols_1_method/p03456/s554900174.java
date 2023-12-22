

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=0;
            if(b>=1&&b<=9)
               m=a*10+b;
            else if(b>=10&&b<=99){
                m=a*100+b;
            }
            else if(b==100)
                m=a*1000+b;
//            System.out.println(m);
//            System.out.println(Math.sqrt(m));
            if((int)Math.sqrt(m)*(int)Math.sqrt(m)==m){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }


        }
        
    }
    

