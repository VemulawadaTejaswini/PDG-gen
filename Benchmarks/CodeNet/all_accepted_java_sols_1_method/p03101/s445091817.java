import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      
      	int H = sc.nextInt(), W = sc.nextInt();
      	int h = sc.nextInt(), w = sc.nextInt();
      
      	int result = (H*W) - (h*W) - (H-h)*w;
      	System.out.println(result);
    }
}