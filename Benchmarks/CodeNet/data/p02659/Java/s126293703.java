import java.util.Scanner;
public class Main{
        public static void main(String[] args){
                final Scanner cin=new Scanner(System.in);
                long a=cin.nextLong();
                float b=cin.nextFloat();
                long k=(long)(b*100);
                long mul=(a*k)/100;
                System.out.print(mul);
        }   
}
