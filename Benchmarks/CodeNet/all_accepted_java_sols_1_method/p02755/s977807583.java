import java.util.Scanner;
public class Main{
  public static void main(String args[]){
  	Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    double d = a/0.08;
    int x = (int)(a/0.08);//a=x*0.08
    if(d!=x) x++;
    System.err.println(x);
      //消費税がa円である範囲(とりあえずxは範囲内)
    int min = a;
    int max = a;
    int xmin = x;
    int xmax = x;
    int i = 0;
    while(min==a){
      xmin--;
      min = (int)(xmin*0.08);
    }
    while(max==a){
      xmax++;
      max = (int)(xmax*0.08);
    }
    System.err.println("min:"+xmin+" max:"+xmax);
    //xmin<x<xmaxの間の数のうち最小のものが答
   	for(int j = xmin+1; j<xmax; j++){
      if(b==(int)(j*0.1)){
        System.out.println(j);
        return;
      }
    }
    System.out.println(-1);
  }
}