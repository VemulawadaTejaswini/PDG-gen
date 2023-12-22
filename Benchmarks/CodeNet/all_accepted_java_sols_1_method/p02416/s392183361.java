import java.util.Scanner;
/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		long sum=0;
		String str,dam;
		char line;
		
		while(true){
			
			str = as.nextLine();
			
			if(str.equals("0")){
				break;
			}
			
			for(int i=0;i<str.length();i++){      //?????????????????????????????????????´???????
	             
	            line = str.charAt(i);
	            sum = sum + Character.getNumericValue(line);
	            
	             
	        }
			str = String.valueOf(sum);
			System.out.println(str);
			sum = 0;
			
		}
		
	}

}