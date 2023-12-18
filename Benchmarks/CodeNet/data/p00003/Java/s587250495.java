import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int dataset;
		int[] data = new int[3];		
		Scanner scanner = new Scanner(System.in);
		dataset = scanner.nextInt();
		for(int i=0; i<dataset; i++){
			for(int j=0; j<3; j++){
				data[j] = scanner.nextInt();
			}
			Arrays.sort(data);
			if(data[2]*data[2] == (data[0]*data[0] + data[1]*data[1])){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}