import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);			
		while(true){
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			if(x==-1 && y==-1)break;
			else if(x==-1 && y!=-1)System.out.println("F");			
			
			int w=x+y;
			if(w>=80)System.out.println("A");
			else if(w>=65)System.out.println("B");
			else if(w>=50)System.out.println("C");
			else if(w>=30){
				if(z>=50) System.out.println("C");
				else System.out.println("D");
			}
			else if(w<=30)System.out.println("F");
		}
		sc.close();
	}