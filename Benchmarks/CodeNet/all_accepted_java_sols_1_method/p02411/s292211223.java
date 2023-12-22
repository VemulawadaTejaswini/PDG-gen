import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String ans;
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();

            if(m == -1 && f == -1 && r == -1){
                break;
            }

            int sum = m + f;

            if(sum >= 80){
                ans = "A";
            }else if(sum >= 65){
                ans = "B";
            }else if(sum >= 50){
                ans = "C";
            }else if(sum >= 30){
                if(r >= 50){
                    ans = "C";
                }else{
                    ans = "D";
                }
            }else{
                ans = "F";
            }

            if(m == -1 || f == -1){
                ans = "F";
            }
            
            System.out.println(ans);
        }
    }
}
