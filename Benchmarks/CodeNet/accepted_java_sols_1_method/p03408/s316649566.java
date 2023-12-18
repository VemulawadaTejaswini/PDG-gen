import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String s[] = new String[N];
    for(int i=0;i<N;i++){
      s[i]=sc.next();
    }
    int M = sc.nextInt();
    String t[] = new String[M];
    for(int i=0;i<M;i++){
      t[i]=sc.next();
    }
    int x[] = new int[N];
    for(int i=0;i<N;i++){
      for(int j=0;j<N;j++){
        if(s[i].equals(s[j])){
          x[i]++;
        }
      }

      for(int j=0;j<M;j++){
        if(s[i].equals(t[j])){
          x[i]--;
        }
      }
    }
    Arrays.sort(x);
    System.out.println(Math.max(0,x[N-1]));

  }
  

  
}
