import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] line=sc.nextLine().split(" ");
		
		int a=Integer.parseInt(line[0]);//赤
		int b=Integer.parseInt(line[1]);//緑
		int c=Integer.parseInt(line[2]);//青
		
		String line1=sc.nextLine();
		int k=Integer.parseInt(line1);
		
		for(int i=0;i<k;i++) {
			if(b<=a) {
				b=b*2;
			}else {
				c=c*2;
			}
		}
		
		if(a<b&&b<c) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	
		
		
	}

}
