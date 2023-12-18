import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h,w,cl;
		h = sc.nextInt();
		w = sc.nextInt();
		char[][] map = new char[h][];
		for(int i = 0;i < h;i++){
			map[i] = sc.next().toCharArray();
			cl = 9;
			for(int k = 0;k < w;k++){
				if(map[i][k] == 'c'){
					System.out.print(0 + " ");
					cl = k;
				}else if(cl != 9){
					System.out.print(k-cl);
				}else{
					System.out.print(-1);
				}
				if(k != w-1)System.out.print(" ");
			}
			System.out.println("");
		}
	}
}