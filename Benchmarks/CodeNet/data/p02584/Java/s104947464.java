import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	
        // スタート
        long x = sc.nextLong();
      	x=Math.abs(x);//面倒なので絶対値を取ってしまう
      	//移動回数
      	long k = sc.nextLong();
      	//移動距離
      	long d = sc.nextLong();
      
      	while(x>0&&k>=1){
          x-=d;
          k-=1;
          //System.out.println("残り"+k+"回の移動");
        }
		
      	if(k%2==0){
          System.out.println(Math.abs(x));
        }else{
          System.out.println(x+d);
        }


    }
}