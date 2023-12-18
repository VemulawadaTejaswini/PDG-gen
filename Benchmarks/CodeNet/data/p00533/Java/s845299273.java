import java.util.*;
public class Main {
	int[][] cnt = new int[100][];
	char[][] c = new char[100][];
	void doIt( ) {
		//?????°??£?¨?
		Scanner sc = new Scanner(System.in);
		int h,w;
		char[] moji;
		h= sc.nextInt();
		w = sc.nextInt();
		Main tenki = new Main();
		//????????±?????\???
		for(int i = 0;i < h;i++){
			//moji = sc.next().toCharArray();
			tenki.c[i] = sc.next().toCharArray();
		}
		//???????????\????????????????¨????
		for(int i = 0;i < h;i++){
			tenki.cnt[i] = tenki.search(i);
		}
		//????????????
		for(int i = 0;i < h;i++){
			for(int k = 0;k < w;k++){
				System.out.print(tenki.cnt[i][k]);
				if(k != w-1)System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public int[] search(int k){
		int[] out = new int[this.c[k].length];
		for(int i = 0;i < this.c[k].length;i++){
			if(this.c[k][i] == 'c'){
				out[i] = 0;
			}else if(i-1 < 0){
				out[i] = -1;
			}else if(out[i-1] == -1){
				out[i] = -1;
			}else{
				out[i] = out[i-1] + 1;
			}
		}
		return out;
	}
	
	public static void main(String [ ] args) {
		new Main( ) . doIt( );
	}
	
	}