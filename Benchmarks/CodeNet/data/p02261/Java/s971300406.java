import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		String[] ary_b = new String[n];

		for (int i=0; i<n; i++) {
			ary_b[i] = stdIn.next();
		}
		String[] ary_s = ary_b.clone();

		for (int i=0; i<ary_b.length; i++) {
			for (int j=ary_b.length-1; j>i; j--) {
				if (ary_b[j].charAt(1) < ary_b[j-1].charAt(1)) {
					swap(ary_b,j,j-1);
				}
			}
		}

		boolean flag = true;
		for (int i=0; i<ary_s.length; i++) {
			int mini = i;
			for (int j=i; j<ary_s.length; j++) {
				if (ary_s[j].charAt(1) < ary_s[mini].charAt(1)) {
					mini = j;
				}
			}
			swap(ary_s,i,mini);
			if(mini - i >1)
				flag = false;
		}

		for (int i=0; i<n-1; i++) {
			System.out.print(ary_b[i]+" ");
		}
		System.out.println(ary_b[n-1]);
		System.out.println("Stable");

		for (int i=0; i<n-1; i++) {
			System.out.print(ary_b[i]+" ");
		}
		System.out.println(ary_b[n-1]);
		if(flag)
			System.out.println("Stable");
		else
			System.out.println("Not stable");
	}

	static void swap(String[] ary,int x,int y){
		String temp = ary[x];
		ary[x] = ary[y];
		ary[y] = temp;
	}
}