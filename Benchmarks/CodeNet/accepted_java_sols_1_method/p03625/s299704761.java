import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());scan.nextLine();
		int[] a = new int [n];
		for (int i = 0;i < n;++i){
			a[i] = Integer.parseInt(scan.next());
		}

		int count = 0;
		long ans = 0;
		Arrays.sort(a);
		for (int i =n-1;i>0; --i){
			if (count==2)break;
			if (a[i]==a[i-1]){
				++count;
				if (ans==0)ans=1;
				ans*=a[i];
				--i;
			}
		}
		if (count == 2){
			System.out.print(ans);
		}else{
			System.out.print(0);
		}


	}
}
//end
