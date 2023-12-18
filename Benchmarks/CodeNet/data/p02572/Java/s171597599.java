import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] s = sc.nextLine().split(" ");
        int product = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n-1; j++) {
                product += (Integer.parseInt(s[i]) * Integer.parseInt(s[j+1]));
            }
        }
        System.out.println(Math.round(product % (Math.pow(10, 9) + 7)));
    }
}