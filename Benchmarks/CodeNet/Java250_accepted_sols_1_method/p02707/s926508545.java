import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int w[] = new int[n];
    for(int i=0;i<n-1;i++) {
    	int a = sc.nextInt();
    	w[a-1] += 1;
    }
    for(int j=0;j<n;j++) {
    	System.out.println(w[j]);
    }
  }
}