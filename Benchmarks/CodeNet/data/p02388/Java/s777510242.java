import java.util.*;
 
class Main {
        public static void main(String args[]) {
                try (Scanner sc = new Scanner(System.in)) {
                        while (true) {
                                int val = sc.nextInt();
                                System.out.println(val * val * val);
                        }
                }
        }
}