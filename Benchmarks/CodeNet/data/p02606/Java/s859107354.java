import java.util.Scanner;
class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int L = sc.nextInt();
      	int R = sc.nextInt();
      	int d = sc.nextInt();
      	int a = R-L;
      	System.out.println(a/d);
    }
}