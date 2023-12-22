import java.util.Scanner;

//20180508
//10

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int[] value = new int[num];

		for(int i = 0;i < num;i++) {
			value[i] = scanner.nextInt();
		}
		for(int j = num-1;j >= 0;j--) {
			System.out.print(value[j]);
			if(j != 0) {
				System.out.print(" ");
			}
		}
		System.out.println();

    	scanner.close();
    }
}
