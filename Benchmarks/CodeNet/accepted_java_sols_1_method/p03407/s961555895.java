import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int c = scan.nextInt();
        if(c <n+m || c == n+m){
        System.out.println("Yes");
        }else{
        System.out.println("No");
        }
    }

}