import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] line=sc.nextLine().toCharArray();
		for(int i=line.length-1;0<=i;i--){
			System.out.print(line[i]);
		}
		System.out.println();
	}
}