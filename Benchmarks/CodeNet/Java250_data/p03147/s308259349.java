import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int h[] = new int[N];
		int k[] = new int[N];
		boolean b[] = new boolean[N];
		int count = 0;
		for(int i = 0;i < N;i++) {
			k[i] = sc.nextInt();
		}
		int oc = 0;
		while(true) {
			int e = oc;
			for(int i = oc;i < N;i++) {
				for(int q = oc;q < N;q++) {
					oc=q;
					if(h[q] != k[q])break;
				}
				if(h[i] != k[i]) {
					e++;
				}
				if(h[i] == k[i]) {
					break;
				}
			}
			boolean w = false;
			for(int j = oc;j < e;j++) {
				if(h[j] != k[j]) {
					w = true;
					h[j]++;
				}
			}
			if(w)count++;

			//---
			boolean f = true;
			for(int i = 0;i < N;i++) {
				if(h[i] != k[i])f=false;
			}
			if(f)break;
		}

		System.out.println(count);
	}
}