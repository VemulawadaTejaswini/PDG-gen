import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		int m,f,r;
		char c;
		Scanner sc = new Scanner(System.in);
		while(true){
			m=sc.nextInt();
			f=sc.nextInt();
			r=sc.nextInt();
			if(m==-1 && r==-1 && f==-1) break;
			else if(m==-1 || f==-1) c='F';
			else if(m+f>=80) c='A';
			else if(m+f>=65) c='B';
			else if(m+f>=50) c='C';
			else if(m+f>=30){
				if(r>=50) c='C';
				else c='D'; 
			}else c='F';
			System.out.println(c);
		}
	}
}