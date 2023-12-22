import java.util.Scanner;
class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int num = 1;; num++ ){
			int numx = scanner.nextInt();
			int numy = scanner.nextInt();
			
			if(numx == 0 && numy == 0){
				break;
			}		    
				else if(numx < numy){
					System.out.println(numx+" "+numy);
				}
				else {
					System.out.println(numy+" "+numx);
				}
	    	}
	}	

}