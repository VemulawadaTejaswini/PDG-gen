import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] output = new int[num];
		int x = 0;
		for(int i = 0; i < num; i++){
			output[i] = i + 1;
			if((output[i] % 3 == 0)){
				System.out.printf(" %d" ,output[i]);
			}else{
				x = output[i];
				do{
					if(x % 10 == 3){
						System.out.printf(" %d" ,output[i]);
						break;
					}
					x = x / 10;
				}while(x != 0);
			}
		}
		System.out.printf("\n");
	}

}
