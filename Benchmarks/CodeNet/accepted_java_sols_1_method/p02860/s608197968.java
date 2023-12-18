import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int n_middle = n/2;
		boolean flag = true;
		String[] a = new String[n];
		String str;
		str = s.next();
		// 変数strの長さ分回す
		for (int i = 0; i < str.length(); i++) {
		    // 配列に順番に格納する
		    a[i] = String.valueOf(str.charAt(i));
		}

		if(n_middle == 0 || str.length() % 2 != 0) {
			flag = false;
		}else
		{
		for(int i=0; i<n_middle; i++) {
			if(!a[i].equals(a[n_middle+i])) {
				flag = false;
			}
		}
		}


		if(flag == true) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}

	}
}
