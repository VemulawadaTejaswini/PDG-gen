import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] ans = new String[a];
        for(int i = 0; i < a; i++){
            ans[i] = sc.next() + "_" + (1100 - sc.nextInt() ) + "_" + (i + 1);
        }
        Arrays.sort(ans);
        for(int i = 0; i < a; i++){
            String[] s =  ans[i].split("_");
            System.out.println(s[2]);
        }
    }
}