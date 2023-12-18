import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int H=sc.nextInt();
    int N=sc.nextInt();
    int Ans=0;
    
    for(int i=0;i<N;i++){
      Ans+=sc.nextInt();
    }
    if(Ans>=H){
      System.out.print("Yes");
    }else{
      System.out.print("No");
    }
  }
}