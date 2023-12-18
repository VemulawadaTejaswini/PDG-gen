import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = sc.next();
        int N = s.length();

        //check 1
        for(int i = 1; i<N; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                System.out.println(i + " " + (i+1));
                System.exit(0);
            }
        }

        //check 2
        for(int i = 2; i<N; i++){
            if(s.charAt(i) == s.charAt(i-2)){
                System.out.println((i-1) + " " + (i+1));
                System.exit(0);
            }
        }

        //no match
        System.out.println("-1 -1");
    }
}
