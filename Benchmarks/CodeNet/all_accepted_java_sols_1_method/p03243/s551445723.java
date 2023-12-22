import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();

	while(n%111!=0){
		n++;
	}
	System.out.println(n);
	}}