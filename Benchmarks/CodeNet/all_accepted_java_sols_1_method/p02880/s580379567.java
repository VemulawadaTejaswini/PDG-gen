import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //PrintWriter pw = new PrintWriter("TaskABeg144.out");
        int n = sc.nextInt();
        boolean done = false;
        for(int i = 1; i<=9; i++){
            if(n%i == 0 && (n/i) <= 9){
                System.out.println("Yes");
                done = true;
                break;
            }
        }
        if(!done){
            System.out.println("No");
        }
    }
}