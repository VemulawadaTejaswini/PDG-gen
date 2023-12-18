import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(a > b){
				System.out.println("a > b");
			}else if(a < b){
				System.out.println("a < b");
			}else if(a == b){
				System.out.println("a == b");
			}
		}finally{
			if(scan !=null)scan.close();
		}

	}
}