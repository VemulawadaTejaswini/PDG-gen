import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int m=sc.nextInt();
			int f=sc.nextInt();
			int r=sc.nextInt();
			if(m==-1&&f==-1&&r==-1)break;
			int s=m+f;
			if(m==-1||f==-1)System.out.println("F");
			else if(s<30)System.out.println("F");
			else if(30<=s&&s<50){
				if(f>=50)System.out.println("C");
				else System.out.println("D");
			}
			else if(50<=s&&s<65)System.out.println("C");
			else if(65<=s&&s<80)System.out.println("B");
			else System.out.println("A");
		}
	}
}