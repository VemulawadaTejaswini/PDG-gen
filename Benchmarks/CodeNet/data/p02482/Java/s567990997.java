import java.util.Scanner;
public class Main{
        public static void main(String args[]){
                int a,b,small,large;
                Scanner in =new Scanner(System.in);
                a=in.nextInt();
                b=in.nextInt();
                if(a<b)System.out.println("a<b");
                else if(a>b)System.out.println("a>b");
                else System.out.println("a==b");
        }
}