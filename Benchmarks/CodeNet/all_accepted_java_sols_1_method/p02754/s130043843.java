import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        //何個とるか
		long num = sc.nextLong();
		//青いボールの数
		long blue = sc.nextLong();
		//赤いボールの数
		long red = sc.nextLong();
		//赤+青が割り切れるか
        long n = num/(blue+red);
      	//赤+青の余り
        long amari=num%(blue+red);
      	//端数がマイナスの場合、amariを足した数を出力
      	if(amari - blue<=0){
         	 System.out.println(blue*n+amari);
        //端数がプラスの場合、青いボールの個数を足して出力
        }else{
             System.out.println(blue*(n+1));
        } 
	}
}