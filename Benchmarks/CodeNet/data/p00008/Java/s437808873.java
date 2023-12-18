import java.util.Scanner;

class Main { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int sum = in.nextInt();
            System.out.println(sumOfFourIntegers(sum));
        }
        
    }
    static int sumOfFourIntegers(int sum) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    int rest = sum - i - j - k;
                    if (rest <= 9 && rest >= 0) count += 1;
                }
            }
        }
        return count;
    }
}