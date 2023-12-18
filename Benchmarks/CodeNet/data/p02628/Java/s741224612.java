import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
 
public class Main {    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] p = new int[n];
        for(int i=0;i<n;i++){
            p[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(p);
        int ans = 0;
        for(int i=0;i<k;i++){
            ans = ans + p[i];
        }
        System.out.println(ans);
        
    }
}