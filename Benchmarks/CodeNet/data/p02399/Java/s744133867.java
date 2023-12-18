import java.util.Scanner;

class Main{
        public static void main(String args[]){
                Scanner scan = new Scanner(System.in);
                int val1=scan.nextInt();
                int val2=scan.nextInt();
                int a=val1/val2;
                int b=val1%val2;
                double c=(double)val1/val2;
                String f=String.format("%.6f",c);
                System.out.println(a+" "+b+" "+f);
        }
}