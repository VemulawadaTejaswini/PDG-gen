import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int m,f,r;
			m=cin.nextInt();
			f=cin.nextInt();
			r=cin.nextInt();
			if(m==-1 && f==-1 && r==-1){
				break;
			}
			else if(m==-1 || f==-1){
				System.out.println("F");
			}
			else if(m+f>=80){
				System.out.println("A");
			}
			else if(m+f<80 && m+f>=65){
				System.out.println("B");
			}
			else if(m+f>=50 && m+f<65){
				System.out.println("C");
			}
			else if(m+f>=30 && m+f<50 && r<49){
				System.out.println("D");
			}
			else if(m+f>=30 && m+f<50 && r>=50){
				System.out.println("C");
			}
			else if(m+f<30){
				System.out.println("F");
			}
		}
	}

}