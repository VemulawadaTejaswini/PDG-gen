import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        int a,b,sub1,sub2;
        Scanner in= new Scanner(System.in);
        a=in.nextInt(); b=in.nextInt();
        sub1=a+b;
        if(sub1%2==0)
            System.out.println(""+(sub1/2));
        else
            System.out.println("IMPOSSIBLE");
    }
}