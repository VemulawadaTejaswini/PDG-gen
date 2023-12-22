import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();
        char[] arr = s.toCharArray();
        arr[K - 1] = s.toLowerCase().toCharArray()[K - 1];
        System.out.println(String.valueOf(arr));
    }
}