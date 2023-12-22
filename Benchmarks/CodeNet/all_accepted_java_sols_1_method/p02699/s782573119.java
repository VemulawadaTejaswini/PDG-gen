import java.util.Scanner;
public class Main {
	  public static void main(String args[]){
	 Scanner scanner = new Scanner(System.in);

int a=scanner.nextInt();
int b=scanner.nextInt();
int c=a-b;
	if(c>0) {
		System.out.println("safe");
	}
	else{
		System.out.println("unsafe");
	}
}
	  }