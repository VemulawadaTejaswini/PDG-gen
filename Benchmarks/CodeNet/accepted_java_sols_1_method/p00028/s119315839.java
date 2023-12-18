import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] suuji=new int[101];
		int[] ruikei=new int[101];
		int a=0;		//入力受付
		int kosu=0;
		int max_atai=0;
		int max_kosu=0;
		while(sc.hasNext()) {
			a=sc.nextInt();
			suuji[a]++;
		}
		for(int i=1; i<101; i++) {
			ruikei[i]=ruikei[i-1]+suuji[i];
			if(suuji[i]>max_kosu) {
				max_kosu=suuji[i];
				max_atai=i;
			}
		}

		for(int i=0; i<101; i++) {
			if(suuji[i]==max_kosu) {
				System.out.println(i);
			}
		}
	}
}
