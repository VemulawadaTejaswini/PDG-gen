import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n;
        n=scan.nextInt();
        if(n%2==0) n-=1;
        System.out.println(n/2);
    }
}