import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    String S[] = new String[N];
    
    for(int i=0; i<N; i++){
      S[i]=sc.next();
    }
    Arrays.sort(S);
    String s = "";
    for(int i=0; i<N; i++){
      s += S[i];
    }
    System.out.println(s);
  }
}
      