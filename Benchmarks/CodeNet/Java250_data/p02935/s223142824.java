import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int x=scan.nextInt();
    int[] num=new int[x];
    for(int a=0; a<x; a++){
      num[a]=scan.nextInt();
    }
    Arrays.sort(num);
    double Ans=num[0];
    for(int a=1; a<x; a++){
      Ans=(Ans+num[a])/2;
    }
    System.out.println(Ans);
  }
}