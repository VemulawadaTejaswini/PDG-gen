import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		int c = Integer.parseInt(scan.next());
		scan.close();
		int count=0;	
		for(int i=1;i<=c;i++){
			if(c%i==0)
				if(i>=a&&i<=b)
					count++;
		}
		System.out.println(count);
		
	}

}