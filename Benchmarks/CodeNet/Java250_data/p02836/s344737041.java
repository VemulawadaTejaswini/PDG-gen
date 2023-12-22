import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int center = s.length()/2;
        int result = 0;
        for (int i =0;i<center;i++){
            if (s.charAt(i) != s.charAt(s.length()-i-1)){
                result++;
            }
        }
        System.out.println(result);
    }
}
