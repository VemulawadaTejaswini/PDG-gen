import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<n;i++) {
      int a = 0;
      int b = 0;
      for(int j=0;j<10;j++) {
        int ball = sc.nextInt(); 
	if(ball-a <= ball-b && ball-a > 0) {
          a = ball;
        }
	else if(ball-b > 0) {
	  b = ball;
	}
	else {
	  System.out.println("NO");
	  break;
	}
	if(j==9) {
          System.out.println("YES");
        }
      }
    }
  }
}