import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.valueOf(scan.nextLine());
        int[] numList = new int[num];

        for(int i=0; i<num; i++) {
            numList[i] = scan.nextInt();
        }

        int[] resultnum = new int[num+1];
        Arrays.fill(resultnum, 0);
        for(int i=0; i<num; i++) {
            resultnum[numList[i]-1] = i+1;
        }

        for(int i=0; i<num; i++) {
            System.out.print(resultnum[i] + " ");
        }
    }
}
