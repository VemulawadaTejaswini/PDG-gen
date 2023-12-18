import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      int n = sc.nextInt();
      int count=0;
      for(int i=0;i<=9;i++) {
        for(int j=0;j<=9;j++) {
          for(int k=0;k<=9;k++) {
            if(0 <= n-i-j-k && n-i-j-k <= 9) {
	      count++;
            }
          }
        }
      }
      System.out.println(count);
    }    
  }
}