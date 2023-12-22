import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5];
        int count = 0;

        for (int i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        for (int i = 4; i > 0; i--) {
            for (int j = 3; j >= 0; j--) {
                if (A[i] - A[j] > k ) {
                    count++;
                } 
            }
        }

        if (count > 0) {
            System.out.println(":(");
        } else {
            System.out.println("Yay!");
        }
    }
}