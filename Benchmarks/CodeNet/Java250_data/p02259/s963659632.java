import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		//データ読み込み
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		
		int s = 1;
		int counter = 0;
		
		while (true){
			if (s == n){
				System.out.print(a[0]);
				
				for(int i = 1; i < n; i++){
					System.out.print(" " + a[i]);
				}
				System.out.print("\n");
				System.out.println(counter);
				break;
			}
			
			for(int i = n - 1; i >= s; i--){
				//左の要素の方が大きかった時には、swap
				if(a[i - 1] > a[i]){
					int temp = a[i - 1];
					a[i - 1] = a[i];
					a[i] = temp;
					counter++;
				}	
			}
			s++;
		}
	}
}
