import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int a = scan.nextInt();
			if(a == 0){
				break;
			}
			int[] star = new int[a];
			for(int i = 0;i < a;i++){
				star[i] = scan.nextInt();
			}
			Arrays.sort(star);
			int count = 1;
			int prev = star[0];
			for(int i = 1;i < a;i++){
				if(prev == star[i]){
					count++;
				}else{
					if(count > a/2){
						break;
					}
					prev = star[i];
					count = 1;
				}
			}
			System.out.println((count <= a/2)?"NO COLOR":prev);
		}
	}
}