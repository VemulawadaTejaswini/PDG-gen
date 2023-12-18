import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		boolean fl;
		int mark = 0;
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int[] square = new int[n];
			square[0] = n;
			System.out.println(n);
			while(true){
				fl = true;
				for(int i = n-1;i >= 0;i--){
					if(square[i] > 1){
						fl = false;
						square = init2(square,n,i);
						print(square,n);
						break;
					}
				}
				if(fl){
					break;
				}
			}
		}
	}
	public static void print(int[] square,int n){
		System.out.print(square[0]);
		for(int i = 1;i < n;i++){
			if(square[i] != 0){
				System.out.print(" " + square[i]);
			}else{
				break;
			}
		}
		System.out.println();
	}
	public static int[] init2(int[] square,int n,int mark){
		square[mark] -= 1;
		for(int i = mark+1;i < n;i++){
			square[i] = 0;
		}
		int t = n;
		for(int i = 0;i <= mark;i++){
			t -= square[i];
		}
		int i = mark+1;
		while(t > 0){
			square[i] = (t > square[mark]) ? square[mark] : t;
			t -= square[mark];
			i += 1;
		}
		return square;
	}
}