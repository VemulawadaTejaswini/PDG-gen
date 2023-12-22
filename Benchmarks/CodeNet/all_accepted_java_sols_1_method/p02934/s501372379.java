import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int x=scan.nextInt();
    double Ans=0;
    for(int a=0; a<x; a++){
      Ans+=1.0/scan.nextInt();
    }
    Ans=1/Ans;
    System.out.println(Ans);
  }
}