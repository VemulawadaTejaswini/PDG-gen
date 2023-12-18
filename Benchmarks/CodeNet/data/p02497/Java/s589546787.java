import java.util.Scanner;

class Main{
	public static void main(String args[]){
		int m,f,r;
		Scanner in = new Scanner(System.in);
		
		while(true){
			m = Integer.parseInt( in.next() );
			f = Integer.parseInt( in.next() );
			r = Integer.parseInt( in.next() );
			
			if(m == -1 &&(f == -1 && r == -1)) break;
			
			if(m == -1 || f == -1){
				System.out.println("F");
			}
			else {
				if(m+f >= 80){
					System.out.println("A");
				}
				else if(m+f >= 65){
					System.out.println("B");
				}
				else if(m+f >= 50){
					System.out.println("C");
				}
				else if(m+f >= 30){
					if(r >= 50){
						System.out.println("C");
					}
					else{
						System.out.println("D");
					}
				}
				else{
					System.out.println("F");
				}
			}
		}
		
	}
}