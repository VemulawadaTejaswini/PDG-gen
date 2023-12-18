import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //PrintWriter pw = new PrintWriter("Main.out");

        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        int diff = 1;
        char prev = s.charAt(0);
        for(int i = 0; i<n; i++){
            if(s.charAt(i) != prev){
                diff++;
            }
            prev = s.charAt(i);
        }
        System.out.println(diff);

    }
}