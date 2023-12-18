import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int L = scan.nextInt();
        String str[] = new String[N];
        String ans = "";

        for(int i=0; i<N; i++){
            str[i] = scan.next();
        }
        Arrays.sort(str);
      
        for(int i=0; i<N; i++){
            ans = ans + str[i];
        }
    System.out.println(ans);
    }
}
