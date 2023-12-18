import java.util.Scanner;


public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int x = scanner.nextInt();
        int count = 0;
        while (true){
          if(scanner.next().equals("snuke")){
              int a = count % x + 1;
              int b = count / x + 1;
              byte c[] = new byte[1];
              c[0] = (byte)(a + 64);
              System.out.println(new String(c) + b);
              break;
          }
            else{
              ++count;
          }

        }
    }
}