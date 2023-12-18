import java.io.IOException;
import java.util.Scanner;
 
class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
 
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] list = new int[r][c];
        int[] sumR = new int[r];
        int[] sumC = new int[c];
        int sumRC = 0;
 
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j] = scanner.nextInt();
            }
        }
 
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                sumR[i] += list[i][j];
            }
        }
         
        for (int i = 0; i < list[0].length; i++) {
            for (int j = 0; j < list.length; j++) {
                sumC[i] += list[j][i];
            }
            sumRC += sumC[i];
        }
 
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println(sumR[i] + "");
        }
         
        for (int num : sumC) {
            System.out.print(num + " ");
        }
        System.out.print(sumRC + "\n");
    }
}