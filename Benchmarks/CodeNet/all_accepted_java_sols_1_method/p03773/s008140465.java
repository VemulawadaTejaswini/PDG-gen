import java.util.*;

class Main {
        public static void main(String args[]) {
                try (Scanner sc = new Scanner(System.in)) {
                        System.out.println((sc.nextInt() + sc.nextInt()) % 24);
                }
        }
}