
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int temp1,temp2,num;
		boolean check = true,check2 = false;
		String ans = "not coprime";
		int n;
		int[] a;
		String str;
		String[] s;
		str = bf.readLine();
		n = Integer.parseInt(str);
		str = bf.readLine();
		s = str.split(" ");
		a = new int[n];
		for(int i = 0;i < n;++i) {
			a[i] = Integer.parseInt(s[i]);
		}
		temp1 = a[0];
		for(int i = 1;i < n;++i) {
			temp2 = a[i];
			while(temp1 != 1 && temp2 != 0) {
				if(temp1 > temp2) {
					num = temp1;
					temp1 = temp2;
					temp2 = num;
				}
				temp2 = temp2%temp1;
			}
			if(temp1 == 1) {
				ans = "setwise coprime";
				check2 = true;
				break;
			}
		}
		if(check2) {
			for(int i = 0;i < n-1;++i) {
				for(int j = i+1;j < n;++j) {
					temp1 = a[i];
					temp2 = a[j];
					while(temp1 != 1 && temp2 != 0) {
						if(temp1 > temp2) {
							num = temp1;
							temp1 = temp2;
							temp2 = num;
						}
						temp2 = temp2%temp1;
					}
					if(temp1 != 1) {
						check = false;
						break;
					}
				}
				if(!check) {
					break;
				}
			}
			if(check) {
				ans = "pairwise coprime";
			}
		}
		System.out.println(ans);
	}
}