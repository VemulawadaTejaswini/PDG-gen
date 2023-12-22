import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();
        int[] aList = new int[n];
        int consumedNum = 0;
        for (int i = 0; i < n; i++) {
            aList[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int counter = 0;
            while(true){
               if(aList[i] * counter + 1 > d){
                   break;
               }
               consumedNum++;
               counter++;
            }
        }
        System.out.println(consumedNum + x);
    }
}
