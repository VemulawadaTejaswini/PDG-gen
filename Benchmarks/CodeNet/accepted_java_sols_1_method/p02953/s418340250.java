import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M[] =new int[N];
    int L =M[0];
    int s =0;
    for(int i=0;i<N;i++){
      M[i]=sc.nextInt();
    L = Math.max(L,M[i]);
    if(L-1>M[i]){break;}
      s=s+1;}
    if(s==N){System.out.println("Yes");}
    else{System.out.println("No");
        }
  }
}