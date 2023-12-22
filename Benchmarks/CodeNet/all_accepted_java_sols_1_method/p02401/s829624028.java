import java.util.Scanner;

/**
 * @author kawakami
 *
 */
 class  Main{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner as = new Scanner(System.in);
		
		int a,b;
		String op;
		
		
		
		
		while(true){
			
			a=as.nextInt();
			op=as.next();
			b=as.nextInt();
			
			if(op.equals("?")){
				break;
			}
			else{
		
				switch(op){
		
				case"+":
					System.out.println(a+b);
					break;
				
				case"-":
					System.out.println(a-b);
					break;
					
				case"*":
					System.out.println(a*b);
					break;
					
				case"/":
					System.out.println((int)(Math.ceil(a/b)));
					break;
					
				default:
					System.out.println("Error!!");
					break;
			}
		}
		}
			
		
				
		
		

	}

}