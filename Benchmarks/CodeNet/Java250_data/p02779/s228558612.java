import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		
		int a[] = new int[N];//N個の配列をつくる
		Set<Integer> set = new HashSet<Integer>();//HashSetで空の箱を作る
		for(int  i=0; i<N; i++) {
			a[i]= sc.nextInt();
			set.add(Integer.valueOf(a[i]));//set.addで空の箱に重複を除いたaを追加する
		}
		//元の配列の要素数と異なればNO、変化していなければYES
		if(set.size()!=N){
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
	}		
}