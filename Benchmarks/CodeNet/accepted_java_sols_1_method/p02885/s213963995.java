import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //PrintWriter pw = new PrintWriter("Main.out");

        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a - 2*b > 0){
            System.out.println(a-2*b);
        }
        else{
            System.out.println(0);
        }

    }
}