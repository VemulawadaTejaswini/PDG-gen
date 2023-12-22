import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		while(sc.hasNext()){
			Long t = sc.nextLong();
			for(int i=0; i<10; i++) { a[i] = (int)(t%10); t/=10;} 
			
			for(int n=0; n<10; n++){
				for(int i=0; i<9-n; i++) a[i] = (a[i]+a[i+1])%10;
			}
			System.out.println(a[0]);
			
		}
	}

}