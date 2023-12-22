import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int box[] = {0, 0, 0};
		int cash;
		box[0] = sc.nextInt();
		box[1] = sc.nextInt();
		box[2] = sc.nextInt();
		
		for(int i = 0; i < 2; i++){
			for(int j = i+1; j < 3; j++){
				if(box[i] > box[j]){
					cash = box[i];
					box[i] = box[j];
					box[j] = cash;
				}
			}
		}
		System.out.println(box[0]+" "+box[1]+" "+box[2]);
	}
}