import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	     String n = sc.nextLine();
	     int N = Integer.parseInt(n);

	     for (int i = 0; i < N; i++) {
	    	 
			String a = sc.nextLine();
            String[] array = a.split(" ");
            String b = array[0];
            String c = array[1];

            
			int x = Integer.parseInt(array[0]);			
			int y = Integer.parseInt(array[1]);
			int z = Integer.parseInt(array[2]);
			
			if(x*x + y*y == z*z){
				System.out.println("YES");
			}else if(x*x + z*z == y*y){
				System.out.println("YES");
			}else if(y*y + z*z == x*x){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
		}
		
		
	}

}