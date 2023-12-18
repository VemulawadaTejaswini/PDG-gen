import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int[] a = new int[5];
			for(int i=0;i<a.length;i++){
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			for(int i=a.length-1;i >= 0;i--){
				System.out.print(a[i]);
				if(i <= 0){
					break;
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}