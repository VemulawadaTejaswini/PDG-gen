import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] L = new int[N];
		for(int i=0; i<N; i++) {
			L[i] = sc.nextInt();
		}


		int n=0;
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				if(L[j]==L[i]) {
					continue;
				}
				for(int k=j+1; k<N; k++) {
					if(L[k]==L[i] || L[k]==L[j]) {
						continue;
					}
					// 3角形ができるはmaxの長さ＜他の２つの和
					if(L[i]>L[j]) {
						if(L[j]>L[k]) {
							// L[i] がmax
							if(L[i] < L[k]+L[j]) {
								n++;
							}
						}else {
							// L[i]>L[j], L[k]>L[j]
							if(L[i]>L[k]) {
								// L[i] がmax
								if(L[i] < L[j]+L[k]) {
									n++;
								}
							}else {
								// L[k] がmax
								if(L[k] < L[i]+L[j]) {
									n++;
								}
							}
						}
					}else {
						// L[j] > L[i]
						if(L[j]>L[k]) {
							// L[j]>L[i], L[j]>L[k]
							// L[j] がmax
							if(L[j] < L[i]+L[k]) {
								n++;
							}
						}else {
							// L[k] がmax
							if(L[k] < L[i]+L[j]) {
								n++;
							}
						}
					}
				}
			}
		}

		System.out.println(n);

	}

}
