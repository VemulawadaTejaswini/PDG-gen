import java.util.Scanner;
public class Main{
	  public static void main(String args[]){
	 Scanner scanner = new Scanner(System.in);

int a=scanner.nextInt();
int h=a%100;
int t=h%10;

if(a/100==7) {
	System.out.println("Yes");
}
else if(h/10==7) {
	System.out.println("Yes");
}
else if(t==7) {
	System.out.println("Yes");
}
else {
	System.out.println("No");
}

}
	  }