import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int a[] = new int[number];

        for (int i = 0; i < number; i++) {
            a[i] = scanner.nextInt();
        }
        //最小値
        int intMin = a[0];
        for(int i = 1; i < a.length; i++) {
        	if(intMin > a[i]) {
        		intMin = a[i];
        	}
        }
        
        //最大値
        int intMax = a[0];
        for(int i = 1; i < a.length; i++) {
        	if(intMax < a[i]) {
        		intMax = a[i];
        	}
        }

        /* 総和の計算 */
        long sum = 0;

        for (int i = 0; i < number; i++) {
            sum += a[i];
        }

        System.out.println(intMin + " " + intMax + " " + sum);

	}
}

