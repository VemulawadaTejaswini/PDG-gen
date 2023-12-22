import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// キーボード入力
		Scanner stdIn = new Scanner( System.in );
		int w = stdIn.nextInt();//縦棒の数
		int n = stdIn.nextInt();//横棒の数
		String[] yoko = new String[n];
		for(int i=0;i<n;i++){
			yoko[i] = stdIn.next();
		}
		int[] amida = new int[w];
		for(int i=0;i<w;i++){
			amida[i] = i+1;
		}
		for(int i=0;i<n;i++){
			String[] a = yoko[i].split(",");
			int[] b = {Integer.parseInt(a[0]),Integer.parseInt(a[1])};
			int temp = 0;

			temp = amida[b[0]-1];
			amida[b[0]-1] = amida[b[1]-1];
			amida[b[1]-1] = temp;
		}
		for(int i=0;i<amida.length;i++){
			System.out.println(amida[i]);
		}
	}
}