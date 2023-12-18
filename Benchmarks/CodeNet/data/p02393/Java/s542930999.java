import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a[3] = new int[3];
		for(int i = 0; i < 3; i++){
			a[i] = sc.nextInt();
		}
		
		for(i = 0; i < 3; i++){
			for(int j = i + 1; j < 3 - 1; j++){
				if(a[i] > [j]){
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		for(i = 0; i < 3; i++){
			System.out.print(a[i]);
			if(i == 2){
				System.out.println("");
			}else{
				System.out.print(" ");
			}
		}
	}
}
			