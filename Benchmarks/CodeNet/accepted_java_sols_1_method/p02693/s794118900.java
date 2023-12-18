import java.util.Scanner;
public class Main {
	  public static void main(String args[]){
	 Scanner scanner = new Scanner(System.in);

int k=scanner.nextInt();
int a=scanner.nextInt();
int b=scanner.nextInt();

for(int i=a;i<=b;i++) {
	if(i%k==0) {
		System.out.println("OK");
		break;
	}
	if(i==b
			) {
		System.out.println("NG");
		break;
	}

}
}
	  }