import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int count=0;

		for(int i=1;i<n+1;i++){
			if(String.valueOf(i).length()%2!=0){
				count++;
			}
		}
		System.out.println(count);
	}
}