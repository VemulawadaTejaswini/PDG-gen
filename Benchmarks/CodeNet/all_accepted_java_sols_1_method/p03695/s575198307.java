import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Rcnt=0;
    int c[] = new int[N];
    int min=1;
    int max=0;
    int tmp=0;
    
    for(int i=0;i<N;i++){
      tmp=sc.nextInt();
      if(tmp>=3200){
        Rcnt++;
      }
      c[i]=tmp/400;
    }
    Arrays.sort(c);
    if(N==Rcnt){
      System.out.print(1);
      System.out.print(" ");
      System.out.println(Rcnt);
      return;
    }
    for(int i=0;i<N-Rcnt-1;i++){
      if(c[i]!=c[i+1]){
        min++;
      }
    }
    System.out.print(min);
    System.out.print(" ");
    System.out.println(min+Rcnt);
  }
  

  
}