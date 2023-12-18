import java.util.*;
		
public class Main{
	public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			int N = 0;
			int x = 0;
			int y = 0;
			int b = 0;
			int p = 0;
			int f;
			int a = 99999;
			N = scan.nextInt();
			for(int i=0;i<N;i++){
				x = scan.nextInt();
				y = scan.nextInt();
				b = scan.nextInt();
				p = scan.nextInt();
				f = x * b + y * p;	//通常の値段
				if(b >= 5 && p >= 2){
					a = f * 8 / 10;
				}else
				if(b >= 5 && p < 2){	//b>5を判定
					a = f * 8 / 10;
				}else
				if(b < 5 && p >= 2){	//p>2を判定
					a = f * 8 / 10;
				}else{
					System.out.println(f);
				}
				
				if(f > a){
					System.out.println(a);
				}else{
					System.out.println(f);
				}
			}
	}
}