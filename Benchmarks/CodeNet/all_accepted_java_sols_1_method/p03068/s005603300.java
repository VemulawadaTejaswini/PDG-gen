import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();


        char c = s.charAt(k-1);


        StringBuilder sb = new StringBuilder();
        for(char t: s.toCharArray()) {
            if(t == c) sb.append(t);
            else sb.append('*');
        }

        System.out.println(sb);


    }


}
