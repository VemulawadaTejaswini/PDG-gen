import java.util.Scanner;
public class Main{
	private static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		while(true){
			int m=sc.nextInt();
			int f=sc.nextInt();
			int r=sc.nextInt();
			int sum = m+f;
			if(m==-1&&f==-1&&r==-1){
				break;
			}
			if(m==-1||f==-1){
				System.out.println("F");
			}
			if(sum>=80){
				System.out.println("A");
			}
			if(sum<80&&sum>=65){
				System.out.println("B");
			}
			if(sum<65&&sum>=50){
				System.out.println("C");
			}
			if(sum<50&&sum>=30){
				if(r>=50){
					System.out.println("C");
				}else{
					System.out.println("D");
				}
			}
			if(sum<30){
				System.out.println("F");
			}
		}
	}
}