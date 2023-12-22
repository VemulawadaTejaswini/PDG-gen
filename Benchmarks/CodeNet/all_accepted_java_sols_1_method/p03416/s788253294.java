import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int count = 0;
        for(int i = A; i <= B; i++) {
            String tmp = String.valueOf(i);
            boolean ok = true;
            for(int j = 0; j < tmp.length() / 2; j++) {
                if(tmp.charAt(j) != tmp.charAt(tmp.length() - j - 1)) {
                    ok = false;
                    break;
                }
            }
            if(ok) count++;
        }
        System.out.println(count);
    }
}