import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    String S = scan.next();
    scan.close();

    int flag = 0;
    int count = 0;
    for(int i=0; i<N; i++) {
      switch(flag) {
        case 0:
          if(S.charAt(i) == 'A') {
            flag = 1;
          }
          break;
        case 1:
          if(S.charAt(i) == 'B') {
            flag = 2;
          }
          else if(S.charAt(i) == 'A') {
            flag = 1;
          }
          else {
            flag = 0;
          }
          break;
        case 2:
          if(S.charAt(i) == 'C') {
            count++;
            flag = 0;
          }
          else if(S.charAt(i) == 'A') {
            flag = 1;
          }
          else {
            flag = 0;
          }
          break;
      }
    }

    System.out.println(count);
  }
}