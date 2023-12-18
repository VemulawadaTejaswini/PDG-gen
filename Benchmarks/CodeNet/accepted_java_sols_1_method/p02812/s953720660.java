import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int count = 0;
        for (int i=0; i<=N-3; i++) {
            String temp = S.substring(i,i+3);
            if (temp.equals("ABC")) {
                count++;
            }
        }
        System.out.println(count);
    }
}

// cool function

//     public static boolean isPrime(int n) {
//        return !new String(new char[n]).matches(".?|(..+?)\\1+");
//    }
