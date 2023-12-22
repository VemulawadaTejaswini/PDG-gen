import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int a =  sc.nextInt();
	int b =  sc.nextInt();
    int x = -1;
    boolean flag = true;
	for(int i=0;i<10000;i++) {
		if(a==(8*i)/100&&b==(10*i)/100) {
			x = i;
			break;
		}
	}
    System.out.println(x) ;
  }
}