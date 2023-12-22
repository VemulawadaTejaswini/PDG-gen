import java.util.Scanner;
class Main {
	public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int b = scan.nextInt();

    int max = a + b;

    if(max<a-b) {
    	max=a-b;
    }

    if(max<a*b) {
    	max=a*b;
    }
    System.out.println(max);
	}
}