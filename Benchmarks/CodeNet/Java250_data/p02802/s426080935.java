import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N =sc.nextInt();
    int M =sc.nextInt();
    int P[]=new int[M];
    String Q[]=new String[M];
    int R[] =new int[N];
    int S[] =new int[N];
    int x=0;int y=0;
    for(int i=0;i<M;i++){
      P[i]=sc.nextInt();
      Q[i]=sc.next();
      if(R[P[i]-1]==1){continue;}
      if(Q[i].equals("AC")){
        R[P[i]-1]=1;x=x+1;y=y+S[P[i]-1];}
      else{S[P[i]-1]=S[P[i]-1]+1;}}
    System.out.println (x+" "+y);
  }
}