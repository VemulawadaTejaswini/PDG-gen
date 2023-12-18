import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int f = scan.nextInt();
		int r = scan.nextInt();
		while(m!=0||f!=0||r!=0){
			if(m+f<30 || m==-1 || f==-1)
				System.out.println("F");
			else if(m+f>80)
				System.out.println("A");
			else if(m+f<80&&m+f>65)
				System.out.println("B");
			else if(m+f<65&&m+f>50)
				System.out.println("C");
			else if(m+f<50&&m+f>30&&r<50)
				System.out.println("D");
			else
				System.out.println("C");
			m = scan.nextInt();
			f = scan.nextInt();
			r = scan.nextInt();
		}
	}
}