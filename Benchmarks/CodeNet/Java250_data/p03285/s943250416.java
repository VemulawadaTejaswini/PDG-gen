import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = "No";
        int n = sc.nextInt();

        for(int i=0; i<16; i++){
            for(int j=0; j<26; j++){
                if(7*i + 4*j == n ){
                    ans ="Yes";
                }
            }
        }

        System.out.println(ans);

    }
}
