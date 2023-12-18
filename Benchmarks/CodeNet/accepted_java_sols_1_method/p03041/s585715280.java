import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();

        char[] charArray = S.toCharArray();
        charArray[K-1] = Character.toLowerCase(charArray[K-1]);
        String result = new String(charArray);
        System.out.println(result);
        
    }
}