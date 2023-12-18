import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] star = new int[1000000];
		while(scan.hasNext()){
			int a = scan.nextInt();
			if(a == 0){
				break;
			}
			for(int i = 0;i < a;i++){
				star[i] = scan.nextInt();
			}
			Arrays.sort(star,0,a);
			int count = 1;
			int prev = star[0];
			int hA = a / 2;
			for(int i = 1;i < a;i++){
				if(count > hA){
					break;
				}
				if(prev == star[i]){
					count++;
				}else{
					prev = star[i];
					count = 1;
				}
			}
			System.out.println((count <= hA)?"NO COLOR":prev);
		}
	}
}