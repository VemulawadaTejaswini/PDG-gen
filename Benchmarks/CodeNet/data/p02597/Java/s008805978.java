import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] stoneArr = sc.next().toCharArray();
        int count = 0;
        for(int i=0; i<n/2; i++) {
            if(stoneArr[i] == 'W') count++;
        }
        System.out.println(count);
    }
}


