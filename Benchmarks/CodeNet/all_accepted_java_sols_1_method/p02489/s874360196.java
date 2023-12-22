import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int count=0;
		Scanner sanner=new Scanner(System.in);
		while(true){
			int i=sanner.nextInt();
			count++;
			if(i==0){
				break;
			}
			System.out.println("Case "+count+": "+i);
		}
	}
}