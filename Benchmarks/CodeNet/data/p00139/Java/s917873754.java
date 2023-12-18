import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n; i++){
			String str = sc.nextLine();
			
			if(str.matches(">\'(=+)#\\1~")){
				System.out.println("A");
			}else if(str.matches(">\\^(Q=)+~~")){
				System.out.println("B");
			}else{
				System.out.println("NA");
			}
			
		}
		
	}
	
}