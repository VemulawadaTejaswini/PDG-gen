import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
		int hit=0;
		int bro=0;
		int[] a = new int[4]; //Aさんの配列
		int[] b = new int[4]; //Bさんの配列

		for(int i=0; i<4;i++) //Aさんの要素数を入力
		{
			a[i]=sc.nextInt();
		}
		for(int i=0; i<4;i++)
		{ //Bさんの要素数を入力
			b[i]=sc.nextInt();
		}
		for(int i=0; i<4;i++) {
			for(int j=0; j<4; j++) {
				if(a[i]==b[j] && i!=j) { //ブローの条件式
					bro++;
				}else if(a[i]==b[j] && i==j){ //ヒットの条件式
					hit++;
				}
			}
		}System.out.println(hit +" "+ bro);

		}
	}
}
