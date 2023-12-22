import java.util.Scanner;

//20180508
//05

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int length = scanner.nextInt();
		long tmp = 0;
		long max = -1000000;
		long min = 1000000;
		long sum = 0;

		for(int i = 0;i < length;i++) {
			tmp = scanner.nextLong();
			max = Math.max(max, tmp);
			min = Math.min(min, tmp	);
			sum += tmp;
		}

		System.out.println(min + " " + max + " " + sum);

    	scanner.close();
    }
}
