import java.util.Scanner;

//20180508
//05

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int length = scanner.nextInt();
		int[] value = new int[length+1];
		int max = 0;
		int min = 1000000;
		int sum = 0;

		for(int i = 1;i <= length;i++) {
			value[i] = scanner.nextInt();
			max = Math.max(max, value[i]);
			min = Math.min(min, length);
			sum += value[i];
		}

		System.out.println(min + " " + max + " " + sum);

    	scanner.close();
    }
}

