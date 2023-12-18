import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String a = sc.next();
            String b = sc.next();
            int result;
            String answer = "";
            int m = 0;
            if (a.length() > 80 || b.length() > 80) {
                System.out.println("overflow");
            } else {
                for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
                    result = (i < 0 ? '0' : a.charAt(i)) - '0' + (j < 0 ? '0' : b.charAt(j)) - '0' + m;
                    answer += result % 10;
                    m = result / 10;
                }
                answer += m == 1 ? m : "";
            }
            if (answer.length() <= 80)
                System.out.println(new StringBuffer(answer).reverse());
            else
                System.out.println("overflow");
        }
    }
}
