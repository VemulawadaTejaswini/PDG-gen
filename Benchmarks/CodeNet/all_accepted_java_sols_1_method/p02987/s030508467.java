
import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        try  (Scanner scanner = new Scanner(System.in);) {
            String s = scanner.nextLine();
            int count = 0;
            boolean flag = true;
            for (int i=0; i < 4; i++) {
                String s1 = s.substring(i,i+1);
                for (int k=0; k < 4; k++) {
                    String s2 = s.substring(k,k+1);
                    if (s1.equals(s2)) {
                        count++;
                    }
                }
                if (count == 2) {
                    count = 0;
                } else {
                    System.out.println("No");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Yes");
            }
        }
    }

}
