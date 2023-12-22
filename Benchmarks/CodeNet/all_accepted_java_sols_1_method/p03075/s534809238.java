import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pos = new int[5];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<5; i++){
            int tmp = scanner.nextInt();
            max = Math.max(max, tmp);
            min = Math.min(min, tmp);
        }

        int k = scanner.nextInt();

        if(max - min > k){
            System.out.println(":(");
        }else {
            System.out.println("Yay!");
        }
    }
}
