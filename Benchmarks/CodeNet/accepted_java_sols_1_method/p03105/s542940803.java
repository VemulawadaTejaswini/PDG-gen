    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;
     
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
          	int count = 0;
            for (int i = 0; i < c; i++) {
              b = b - a;
              if (b < a && b < 0) {
                break;
              } else {
                count++;
              }
            }
            System.out.println(count);
        }
    }