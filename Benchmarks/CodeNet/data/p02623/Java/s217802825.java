import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = 0;
		int su = 0;
		int max = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int [] aa = new int[a];
		int [] bb = new int[b];
		int k = sc.nextInt();
		int z = 0,j = 0;
		for(int i = 0; i<aa.length;i++) {
			aa[i]=sc.nextInt();
			max += aa[i];
		}
		for(int i = 0;i < bb.length;i++) {
			bb[i] = sc.nextInt();
			max += bb[i];
		}
		//入力値の合計がK以下である場合、本の合計数を表示
		if(max<=k) {
			System.out.println(a+b);
		}else {
		while(su<k){
				if(aa[z]>bb[j]) {
					su += bb[j];
					j++;
				}else{
					su +=aa[z];
					z++;
				}
		}
		if(z+j==0) {
			System.out.println(0);
		}else {
			System.out.println(z+j-1);
		}

		sc.close();
		}
	}
}
