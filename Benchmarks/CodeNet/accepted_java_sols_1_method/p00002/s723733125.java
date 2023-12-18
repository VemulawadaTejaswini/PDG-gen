import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int A = scanner.nextInt();//一つ目の数字を取り出す
            int B = scanner.nextInt();//スペース後の２つ目の数字を取り出す
            int ans = A + B;
            int dig = String.valueOf(ans).length();

            System.out.println(dig);
        }
    }
}

