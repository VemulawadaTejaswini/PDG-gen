import java.util.Arrays;
import java.util.Scanner;
class Main{
    public static void main(String[] a){
		 Scanner scanner = new Scanner(System.in);

		 int Hill[] = new int[10];
		 int i;
		 for (i = 0; i < 10; i++ ) {
			 Hill[i] = scanner.nextInt();
		 }

		 Arrays.sort(Hill);
		 System.out.println(Hill[9]);
		 System.out.println(Hill[8]);
		 System.out.println(Hill[7]);
		 scanner.close();

    }
}
