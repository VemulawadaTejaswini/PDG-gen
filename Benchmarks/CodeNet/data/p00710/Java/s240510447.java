import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int r = sc.nextInt();
			if(n == 0 && r == 0){
				break;
			}
			int[] array = new int[n];
			for(int i=0;i<n;i++){
				array[i] = n - i;
			}
			for(int i=0;i<r;i++){
				int p = sc.nextInt();
				int c = sc.nextInt();
				arrayswap(array,p,c);
			}
			System.out.println(array[0]);
		}
	}
	
	public static void arrayswap(int[] array,int p,int c){
		int[] tmp1 = new int[p-1];
		int[] tmp2 = new int[c];
		for(int i=0;i<p-1;i++){
			tmp1[i] = array[i];
		}
		for(int i=0;i<c;i++){
			tmp2[i] = array[p-1+i];
		}
		for(int i=0;i<c;i++){
			array[i] = tmp2[i];
		}
		for(int i=0;i<p-1;i++){
			array[c+i] = tmp1[i];
		}		
	}

}