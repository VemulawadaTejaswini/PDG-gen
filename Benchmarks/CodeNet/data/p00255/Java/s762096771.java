import java.util.Scanner;
public class Main{
	public void run(){
		int[] p = new int[65000];
		int[] j = new int[65000];
		int[] k = new int[65000];
		Scanner scan = new Scanner(System.in);
		while(true){
			int w = 0;
			int z = 0;
			int s = 0;
			System.out.println("パイプの本数");
			int n = scan.nextInt();
			if(n == 0)break;
			for(int i = 0;i < n;i++){
				System.out.println("パイプの長さ");
				p[i] = scan.nextInt();
			}
			for(int u = 0; u < n - 1;u++){
				System.out.println("ジョイントの長さ");
				j[u] = scan.nextInt();
			}
			for(int q = 0; q < n;q++){
				if(p[q] + p[q+1] < j[q]){
					k[q] = p[q] +p[q+1] + j[q];
					s = s + k[q];
					w = w + 1;
					q = q + 1;
				}else{
					k[q] = p[q];
					w = w + 1;
					s = s + k[q];
				}
			}
			for(int d = 1;d < n;d++){
				z = s * w;
			}
			System.out.println(z);
		}
	}
	public static void main(String[] args){
	Main ma = new Main();
	ma.run();
	}
}