import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        for(int i = 0;i<m;i++){
            int a = sc.nextInt();
            sum += a;
        }
         if(n<sum){
             System.out.print("-1");
         }else{
             System.out.print(n-sum);
         }
    }
}