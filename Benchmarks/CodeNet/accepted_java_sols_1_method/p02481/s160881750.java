import java.util.Scanner;

class Main{
        public static void main(String[] args){
                Scanner stdIn=new Scanner(System.in);

                int x=stdIn.nextInt();
                int y=stdIn.nextInt();
                int s=x*y;
                int r=2*x+2*y;
                System.out.println(s+" "+r);
        }
}