import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args){
		sc = new Scanner(System.in);
		while(true){
			int m=sc.nextInt();
			int f=sc.nextInt();
			int r=sc.nextInt();
			if(m==-1||f==-1){
				if(r==-1)break;
				System.out.println("F");
			}
			if(m+f>=80){
				System.out.println("A");
			}else if(m+f>=65){
				System.out.println("B");
			}else if(m+f>=50||r>=50){
				System.out.println("C");
			}else if(m+f>=30){
				System.out.println("D");
			}else if(m+f<30&&m!=-1&&f!=-1){
				System.out.println("F");
			}
		}
	}
}