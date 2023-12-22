import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int time=0;
        if(n1==n2)
            time++;
        if(n1==n3)
            time++;
        if(n2==n3)
            time++;
        if(time==1)
            System.out.println("Yes");
        else
            System.out.println("No");
}}