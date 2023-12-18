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
						mark = i;
						break;
					}
				}
				if(fl){
					break;
				}
				square[mark] -= 1;
				square[mark+1] += 1;
				if(b(square,n)){
					print(square,n);
				}
			}
		}
	}
	public static boolean b(int[] square,int n){
		boolean result = true;
		for(int i = 0;i < n-1;i++){
			if(square[i] < square[i+1]){
				result = false;
				break;
			}
		}
		return result;
	}
	public static void print(int[] square,int n){
		System.out.print(square[0]);
		for(int i = 1;i < n;i++){
			if(square[i] != 0){
				System.out.print(" " + square[i]);
			}else{
				System.out.println();
				break;
			}
		}
	}
}