import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//高橋
		int b = sc.nextInt();//青木
		int k = sc.nextInt();//行動回数
		
		for(int i = 0; i < k; i++){
			if(i%2==0){
				//高橋君の行動
				if(a%2==1) a--;
				a = a/2;
				b = b + a;
			}else{
				//青木君の行動
				if(b%2==1) b--;
				b = b/2;
				a = a + b;
			}
		}
		System.out.println(a + " " + b);
	}
}