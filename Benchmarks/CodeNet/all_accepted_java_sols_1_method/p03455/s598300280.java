import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int num = Integer.parseInt(str);
      	str = scan.next();
      	int numb = Integer.parseInt(str);
      	
		if(num % 2 == 0){
			System.out.println("Even");
		}else if(numb % 2 == 0){
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
	}
}