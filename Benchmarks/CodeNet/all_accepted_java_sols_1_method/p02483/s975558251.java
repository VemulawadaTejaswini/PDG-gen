import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int work;
		
		if(a > c){          // 1 番目が 3 番目より大きいとき
			work = a;       // 1 番目と 3 番目を入れ替える
			a = c;
			c = work;
		}
		if(b > c){          // 2 番目が 3 番目より大きいとき
			work = b;       // 2 番目と 3 番目を入れ替える
			b = c;
			c = work;
			
		}
		if(a > b){          // 1 番目が 2 番目より大きいとき
			work = a;       // 1 番目と 2 番目を入れ替える
			a = b;
			b = work; 
		}
		System.out.println(a+" "+b+" "+c);
	}

}