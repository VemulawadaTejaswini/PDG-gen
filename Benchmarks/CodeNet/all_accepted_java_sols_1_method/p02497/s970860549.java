import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int m,f,r; 
		while(true){
			m = s.nextInt();
			f = s.nextInt();
			r = s.nextInt();
			if(m==-1&&f==-1&&r==-1){
				break;
			}
			else if(m==-1||f==-1){
				System.out.println("F");
			}
			else if(m+f>=80){
				System.out.println("A");
			}
			else if(m+f>=65){
				System.out.println("B");
			}
			else if(m+f>=50){
				System.out.println("C");
			}
			else if(m+f>=30){
				if(r>=50){
					System.out.println("C");
				}
				else{
					System.out.println("D");
				}
			}
			else if(m+f<30){
				System.out.println("F");
			}
		}
	}
}