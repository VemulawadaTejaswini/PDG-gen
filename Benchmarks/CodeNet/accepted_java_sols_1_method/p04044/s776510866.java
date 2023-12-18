import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final int N=sc.nextInt();
    final int L=sc.nextInt();
    String[] s=new String[N];
    for(int i=0;i<N;i++){
      s[i]=sc.next();
    }
    Arrays.sort(s);
    for(int i=1;i<N;i++){
      s[0]+=s[i];
    }
    System.out.println(s[0]);
  }
}