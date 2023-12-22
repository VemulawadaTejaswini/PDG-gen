import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = sc.next();
        int count = 0;
        for (int i = 0; i < a-2; i++) {
            String res = str.substring(i, i + 3);
            if (res.equals("ABC")){
                count++;
            }
        }
        System.out.print(count);
    }
}