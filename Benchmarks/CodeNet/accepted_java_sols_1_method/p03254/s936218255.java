import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int x = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		// スペース区切りの整数の入力
		for(int i=1;i<=n;i++){
			list.add(sc.nextInt());
		}

		Collections.sort(list);
		int count =0;
		int sum = 0;

		while (sum<x&&n>count) {
			int preNum = list.get(count);
			sum+=preNum;
			count++;
			
		// System.out.println(sum);
		}

		// System.out.println(count);
		if(sum>x){
		System.out.println(count-1);
		}else if(sum==x){
		System.out.println(count);
		}else if(sum<x){
		System.out.println(count-1);
		}
	}
}