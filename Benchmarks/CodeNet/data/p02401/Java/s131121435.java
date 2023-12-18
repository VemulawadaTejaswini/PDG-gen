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
			System.out.println(a);
			op=as.next();
			System.out.println(op);
			b=as.nextInt();
			System.out.println(b);
			
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
					System.out.println(Math.ceil(a/b));
					break;
					
				default:
					System.out.println("Error!!");
					break;
			}
		}
		}
			
		
				
		
		

	}

}