/*
　　　　　　 「＾ヽ,ry'＾i 　))　
　　　((　 　 ゝ"´ ⌒｀ヽ. 　 　 /[] 　
　　　　　　 くi Lﾉﾉハﾉ)」 　　/　[]]　　　～ 少 女 祈 祷 中 ～
　　　　　 　 λ.[i ﾟ ヮﾟﾉi! 　 /　[] []
　　　　((　 ⊂ﾚ',ﾍ.i｀ﾑ'」つ/　[] [][]
　　　　　　　,メ-"ｲ-i/つ　　))
　　　　　　　 ﾞ'ｰl_7''"^ 

*/
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int l = sc.nextInt();
		String a[]= new String[N];
		for(int i=0;i<N;i++) {
			a[i]=sc.next();
		}
		Arrays.sort(a);
		for(String b : a) {
			System.out.print(b);
		}
	}
}
