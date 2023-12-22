import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		for(int i=0;i<n;i++) {
			a.add(sc.nextInt());
		}
		sc.close();
		int idx=0;
		int ii=1;
		int cnt=0;
		boolean b = false;
		do {
			// 整数iが見つかる位置
			idx = a.indexOf(ii);
			if(idx>=0) {
				a = a.subList(idx, a.size());
				cnt +=(idx-1);
				ii++;
				b = true;
			}else{
				break;
			}
		}while(n>idx);
		if(n-cnt>a.size()) cnt+=a.size();
		System.out.println(b?cnt:-1);
	}
}
