import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int abcde[]=new int[5];
		for(int i=0;i<abcde.length;i++) {
			abcde[i]=scan.nextInt();
		}
		scan.close();
		int x=0;
		int suffix=0;
		for(int i=0;i<5;i++) {
			if(10-abcde[i]%10>x && abcde[i]%10!=0) {
				suffix=i;
				x=10-abcde[i]%10;
			}
		}
		int sum=0;
		for(int i=0;i<5;i++) {
			if(suffix!=i) {
				sum+=(abcde[i]%10==0)? abcde[i]:abcde[i]-abcde[i]%10+10;
			}
		}
		sum+=abcde[suffix];
		System.out.println(sum);
	}

}