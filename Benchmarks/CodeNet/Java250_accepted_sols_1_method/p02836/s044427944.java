
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1;
        int num = 0;

        String s = sc.nextLine();
        a1 = s.length();

        for(int i =0; i < a1/2; i++){
            if(s.charAt(i) != s.charAt(a1-i-1)){
                num++;
            }
        }
        System.out.println(num);

            // write your code here
    }

}
