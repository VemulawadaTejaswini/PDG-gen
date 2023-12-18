import java.io.*;
import java.util.*;
class Main{
  public static void main(String args[])throws Exception{
    Scanner sc = new Scanner(System.in);
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // String s[]= br.readLine().split("\\s+");
    int sum=0;
    // int n = Integer.parseInt(s[0]);
    // int k = Integer.parseInt(s[1]) ;
    int n = sc.nextInt();
    int k = sc.nextInt();
    int p;
    for(int i =0; i<n; i++){
      sum += sc.nextInt();
    }
    p = sum/k+1;
    System.out.println(p);
  }
}
