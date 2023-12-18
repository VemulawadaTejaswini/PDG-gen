import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        int[] sort = new int[3];
        sort[0] = sc.nextInt();
        sort[1] = sc.nextInt();
        sort[2] = sc.nextInt();
        Arrays.sort(sort);
        System.out.println(sort[0] + " " + sort[1] + " " + sort[2]);
        sc.close();

    }

}
