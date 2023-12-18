import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		int dataset;
		int[] triangledata = new int[3];		
		Scanner scanner = new Scanner(System.in);
		dataset = scanner.nextInt();
		for(int i=0; i<dataset; i++){
			for(int j=0; j<3; j++){
				triangledata[j] = scanner.nextInt();
			}
			Arrays.sort(triangledata);
			if(triangledata[2] < (triangledata[0] + triangledata[1])){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}