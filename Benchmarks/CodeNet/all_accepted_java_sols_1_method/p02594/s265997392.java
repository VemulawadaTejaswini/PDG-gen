import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();
        String ans = "No";
        if(X>=30){
            ans = "Yes";
        }
        System.out.println(ans);
    }
}