import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        String ans = null;

        if(N % 2 == 0){
            String a = S.substring(0, N / 2);
            String b = S.substring(N / 2);
            if(a.equals(b)){
                ans = "Yes";
            }else{
                ans = "No";
            }
        }else{
            ans = "No";
        }

        System.out.println(ans);
    }
}
