import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    
    int N = scanner.nextInt(); //next(文字列), nextDouble, nextLine(1行)とか
	int S = scanner.nextInt();
    
    int x = -1;int y= -1;int z = -1;
    for (int i = 0; i <= N; i++){
      x = i;
      for (int j = 0; j <= N-i; j++){
        y = j;
        z = N - i - j;
        if ((z >= 0) && (10000*x + 5000*y + 1000*z == S)){
          System.out.println(x + " " + y + " " + z);
          return;
        }
      }
    }
    System.out.println(-1 + " " + -1 + " " + -1);
  }
}
