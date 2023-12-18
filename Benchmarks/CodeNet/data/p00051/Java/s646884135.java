import java.util.*;

public class Main {
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new aoj0051().doIt();
	}
	class aoj0051{
		int sum(int a[]){
			double result = 0;
			for(int i = 0;i < 8;i++){
				result = result + (a[7-i] - a[i])*Math.pow(10, 7-i);
			}
			int ans = (int) result;
			return ans;
		}
		void doIt(){
			int n = sc.nextInt();
			int a[] = new int [8];
			for(int i = 0;i < n;i++){
				String str = sc.next();
				char ctr[] = str.toCharArray();
				for(int j = 0;j < 8;j++)a[j] = Integer.parseInt(ctr[j]+"");
				Arrays.sort(a);
				System.out.println(sum(a));
			}
		}
	}
}