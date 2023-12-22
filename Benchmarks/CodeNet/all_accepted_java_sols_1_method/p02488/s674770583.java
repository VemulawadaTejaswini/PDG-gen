import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] sary = new String[n];
        for(int i = 0; i < n; i++){
            sary[i] = sc.next();
        }
        Arrays.sort(sary);
        System.out.println(sary[0]);
    }
}