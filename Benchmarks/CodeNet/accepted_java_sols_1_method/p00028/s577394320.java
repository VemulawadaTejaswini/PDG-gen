import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[100];

		while (sc.hasNext()) {
			int number = Integer.parseInt(sc.nextLine());
			array[number-1] += number;
		}

		for(int i = 0 ; i < array.length ; i++){
			if(array[i] > 0 ){
					array[i] /= i+1;
			}
		}
		int max = 0;
		for(int ary : array){
			if (ary > max) {
				max = ary;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if(array[i] == max){
				System.out.println(i+1);
			}
		}
	}

}