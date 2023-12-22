import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int arrys[] = new int[5];
		// sc.close();

		for(int i = 0; i<arrys.length; i++){
			arrys[i] = sc.nextInt();
		}
		for(int j = 0; j<arrys.length; j++){
			if(0==arrys[j]){
				System.out.println(j+1);
			}
		}
	}
}