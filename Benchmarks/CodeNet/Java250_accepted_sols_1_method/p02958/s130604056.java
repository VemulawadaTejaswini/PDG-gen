import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N =sc.nextInt();
    int M[]= new int[N];
    int P[] =new int[N];
    int x=0;
    for(int i=0;i<N;i++){
      M[i]=i+1;
      P[i]=sc.nextInt();
      if(!(M[i]==P[i])){x=x+1;}}
    if(x<=2){System.out.println("YES");}
    else{System.out.println("NO");}
  }
}