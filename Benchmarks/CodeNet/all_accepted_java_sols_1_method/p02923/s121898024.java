import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    long[] tall=new long[num];
    int x=0, Ans=0;
    for(int a=0; a<num; a++){
      tall[a]=scan.nextInt();
    }
    for(int a=0; a<num-1; a++){
      if(tall[a]>=tall[a+1]){
        x++;
      }else{
        if(Ans<x){
          Ans=x;
        }
        x=0;
      }
    }
    if(Ans<x){
      Ans=x;
    }
    System.out.println(Ans);
  }
}