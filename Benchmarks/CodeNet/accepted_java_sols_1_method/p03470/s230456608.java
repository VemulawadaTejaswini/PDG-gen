import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] d = new int[n];
    int cnt = 1;

    for(int i = 0; i < n; i++)  d[i] = scan.nextInt();

    Arrays.sort(d);
    for(int i = 1 ; i < n; i++){
      if(d[i-1] != d[i])
        cnt++;
    }

    System.out.println(cnt);
  }
}
