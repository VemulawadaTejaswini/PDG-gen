import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int[] a = new int [n+1];
    for(int i = 0; i < n; i++){
        a[i+1] = sc.nextInt();
    }
    sc.close();
    int[] b = new int [n+1];
    int cnt = 0;
    List<Integer>ans = new ArrayList<Integer>();
    for(int i = n; i > 0; i--){
        int c = 0;
        int j = 2;
        while (i*j <= n) {
            c += b[i*j];
            j++;
        }
        if(a[i] != (c%2)){
            b[i] = 1;
            ans.add(i);
        }
    }
    System.out.println(ans.size());
    Collections.reverse(ans);
    ans.stream().forEach(v -> {System.out.print(v + " ");});
  }
}