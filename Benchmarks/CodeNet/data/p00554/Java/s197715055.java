import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		int M=sc.nextInt();
		int atari=0;
		int hazure=0;
		int okane=0;
		int[] amari=new int[1000];
		int goods=M-1;
		for(int i=0; i<M; i++) {
			atari=sc.nextInt();
			hazure=sc.nextInt();
			if(atari>=N) {
				goods--;
			}
			else {
				amari[okane]=atari;
				okane++;
			}
		}
		int kingaku=0;
		if(goods>0) {
			Arrays.sort(amari);

			for(int i=0; i<goods; i++) {
				kingaku+=N-amari[999-i];
			}
		}
		System.out.println(Math.max(kingaku,0));
	}
}

