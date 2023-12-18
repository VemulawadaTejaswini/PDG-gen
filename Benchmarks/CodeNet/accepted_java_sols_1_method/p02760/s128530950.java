import java.util.Scanner;

/**
 * @author yoshizaki
 * abc157
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String[] up = scanner.nextLine().split(" ");
        String[] middle = scanner.nextLine().split(" ");
        String[] down = scanner.nextLine().split(" ");
        
        String[][] bingo = {up, middle, down};
        
        String answer = "No";
        
        int[][] hit = new int[3][3];
        for (int i = 0; i<3 ; i++) {
            for (int j = 0; j<3 ; j++) {
                hit[i][j] = 0;
            }
        }
        int nCount = Integer.parseInt(scanner.nextLine());
        
        String[] numbers = new String[nCount];
        
        for(int i=0 ; i < nCount; i++) {
            numbers[i] = scanner.nextLine();
        }
        check : for (String number: numbers) {
            for (int i = 0; i<3 ; i++) {
                for (int j = 0; j<3 ; j++) {
                    if (number.equals( bingo[i][j] )) {
                        hit[i][j] = 1;
                        continue check;
                    }
                }
            }
        }
        
        if(hit[0][0] + hit[0][1] +hit[0][2] == 3) answer = "Yes";
        if(hit[1][0] + hit[1][1] +hit[1][2] == 3) answer = "Yes";
        if(hit[2][0] + hit[2][1] +hit[2][2] == 3) answer = "Yes";
        if(hit[0][0] + hit[1][0] +hit[2][0] == 3) answer = "Yes";
        if(hit[0][1] + hit[1][1] +hit[2][1] == 3) answer = "Yes";
        if(hit[0][2] + hit[1][2] +hit[2][2] == 3) answer = "Yes";
        if(hit[0][0] + hit[1][1] +hit[2][2] == 3) answer = "Yes";
        if(hit[2][0] + hit[1][1] +hit[0][2] == 3) answer = "Yes";
        
        System.out.println(answer);
    }
}