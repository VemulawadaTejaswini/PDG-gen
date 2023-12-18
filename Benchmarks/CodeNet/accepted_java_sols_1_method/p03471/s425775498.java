import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxNumber = sc.nextInt();
		int sum = sc.nextInt();

		for (int i = 0; i <= maxNumber; i++) {
            int j = 0;
            while (j + i <= maxNumber) {
                int ant = 0;
                ant += 10000 * i;
                ant += 5000 * j;
                ant += 1000 * (maxNumber - (i + j));

                if (ant == sum) {
                    System.out.println(i + " " + j + " " + (maxNumber - (i + j)));
                    return;
                }
                j++;
            }
        }
        
        System.out.println("-1 -1 -1");
	}
}