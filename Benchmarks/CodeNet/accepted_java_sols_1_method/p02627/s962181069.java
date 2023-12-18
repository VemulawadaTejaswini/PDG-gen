    import java.util.Scanner;
     
    public class Main {
     
        public static void main(String[] args) {
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            char c = sc.next().toCharArray()[0];
            System.out.println(c >= 'a' ? 'a' : 'A');
        }
     
    }