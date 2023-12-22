import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] ans = new int[3];
        for(int i = 0; i < 3; i++){
            ans[i] = sc.nextInt();
        }
        System.out.println(ans[2] + " " + ans[0] + " " + ans[1]);
    }

}