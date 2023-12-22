import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if(N%2==1)System.out.printf("%d",N/2+1);
        else System.out.printf("%d",N/2);

    }
}