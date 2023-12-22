import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int M[]=new int[N];
    int x=0;
    for(int i=0;i<N;i++){
      M[i]=sc.nextInt();
       if(((M[i]%2==0)&&(!(M[i]%3==0)))&&(!(M[i]%5==0))){
         System.out.println("DENIED");break;}
      x=x+1;}
    if(x==N){System.out.println("APPROVED");}
  }
}