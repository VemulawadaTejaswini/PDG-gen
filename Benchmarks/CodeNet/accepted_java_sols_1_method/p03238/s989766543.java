import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N,A=0,B=0;
        N=sc.nextInt();
        if(N==1) System.out.println("Hello World");
        else if(N==2){
            A=sc.nextInt();
            B=sc.nextInt();
            int sum=A+B;
            System.out.println(sum);
        }

    }
}