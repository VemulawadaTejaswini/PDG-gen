import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int x[] = new int[5];
    for(int i = 0; i < 5; i++) {
      x[i] = stdIn.nextInt();
    }
    int k = stdIn.nextInt();

    int flag = 1;
    for(int i = 0; i < 4; i++) {
      for(int j = i+1; j < 5; j++) {
          int d = x[i] - x[j];
          if(Math.abs(d) > k) {flag = 0; break;}
      }
    }

    if(flag == 0) {
      System.out.println(":(");
    }else {
      System.out.println("Yay!");
    }
  }
}