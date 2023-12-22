import java.util.*;
public class Main{
	public static void main(String[] args){
		//1<=x<=1000
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();//Xが与えられる！
		int max = 0;//現在の最大のべき乗
		for(int b = 1;b <= x;b++){//
			for(int q = 2;q <= 1000;q++){
				if(Math.pow(b, q) <= x){
					max = (Math.max((int)Math.pow(b, q), max));
				}
			}
		}
		System.out.println(max);
		
		
		
	
	}
}
