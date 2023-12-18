import java.util.*;
public class Main{
	public static void main(String[] args){
		//B-Aは0から数えてB=A個ある
		//もしKの方がb-aより大きい場合全て出力＜ー下書いて思ったけどこれいらないね
		//もしKの方がb-aより小さい場合AND(b-a)/2+1<=kが大きい場合も全て出力
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		int afixation = a;
		int bfixation = b;
		int allnumber = b-a+1;//全部の配列の数
		if((b-a)%2 == 1){
		if((b-a)/2+1>=k){//奇数の時
			for(;a < afixation+k;a++){
				System.out.println(a);
			}
			for(;b-k+1 <= bfixation;b++){
				System.out.println(b-k+1);
			}
		}else if((b-a)/2+1<k){//kの数が配列の半分より上にある時
			for(;a <= b;a++){
				System.out.println(a);
			}
		}
		}else if(((b-a)%2 == 0)){
		if((b-a)/2>=k){//偶数の時
			for(;a < afixation+k;a++){
				System.out.println(a);
			}
			for(;b-k+1 <= bfixation;b++){
				System.out.println(b-k+1);
			}
		}else if((b-a)/2<k){//kの数が配列の半分より上にある時
			for(;a <= b;a++){
				System.out.println(a);
			}
		}
	
		}

		
	}
}
