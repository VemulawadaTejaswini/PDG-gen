import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    long max = 0;

//積が最大になる掛け算を考える
//0<x,0<yのときはx,yは最大値
//x<0,y<0のときはx,yは最小値がベスト
//0<x,y<0のときは、xが最小値,yが最大値
//x<0,0<yのときは、xが最大値,yが最小値

    if(0<=a && 0<=c){
      System.out.println("max = b*d;");
      max = (long)b*d;
    }else if(b<=0 && d<=0){
      System.out.println("max = a*c;");
      max = (long)a*c;
    }else if(0<=a && d<=0){
      System.out.println("max = a*d;");
      max = (long)a*d;
    }else if(b<=0 && 0<=c){
      System.out.println("max = b*c;");
      max = (long)b*c;
    }

    System.out.println(max);

	}
}
