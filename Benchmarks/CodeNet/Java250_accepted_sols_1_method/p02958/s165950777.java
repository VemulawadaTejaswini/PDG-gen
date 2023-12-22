import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int differ = 0;//間違いを入れる
		
		for(int i=1; i<=N; i++) {
			int P =sc.nextInt();
        //iとPが一致していなければ間違いを+1する
		if(i!=P){
				differ++;
			}
		}
        //間違いが2つならそれを入れ替えて昇順にできる
        //2つ以内ならYes
		System.out.println(differ<=2?"YES":"NO");
	}
}