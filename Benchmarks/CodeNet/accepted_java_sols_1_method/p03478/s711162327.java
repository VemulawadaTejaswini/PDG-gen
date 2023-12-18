import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int lower = scanner.nextInt();
        int upper = scanner.nextInt();
        String num = new String();
        int tmp = 0;
        int sum = 0;

        for(int i=0; i<=limit; i++) {
            num = Integer.toString(i);
            for(int j=0; j<num.length(); j++) {
                tmp += Character.getNumericValue(num.charAt(j));
            }
            if(tmp >= lower && tmp <= upper) {
                sum += i;
            }
            tmp = 0;
        }
        System.out.println(sum);
    }
}
