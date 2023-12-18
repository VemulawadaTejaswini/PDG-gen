import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			int m,f,r;
			while(true){
				m = scan.nextInt();
				f = scan.nextInt();
				r = scan.nextInt();
				if((m == f) &&(f == r) &&(m == -1))break;
				int sum = m + f;
				if(m == -1 || f == -1){
					System.out.println("F");
				}else if(sum >= 80){
					System.out.println("A");
				}else if(sum >=65){
					System.out.println("B");
				}else if(sum >=50){
					System.out.println("C");
				}else if(sum >=30){
					if(r >=50){
						System.out.println("C");
					}else{
						System.out.println("D");
					}
				}else{
					System.out.println("F");
				}
			}
		}finally{
			if(scan !=null)scan.close();
		}
	}
}