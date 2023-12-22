import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
       int sum = x;
       int ans = 1;
       while(sum%360!=0){
           sum+=x;ans+=1;
       }
        System.out.println(ans);
    }
}