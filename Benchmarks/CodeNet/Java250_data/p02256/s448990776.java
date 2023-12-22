import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int x=sc.nextInt();
        int y=sc.nextInt();
        while(y>0){
            int t=x%y;
            x=y;
            y=t;
        }
        System.out.println(x);
    }
}