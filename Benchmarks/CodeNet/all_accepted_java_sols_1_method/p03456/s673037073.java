
import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num_1=sc.nextInt();
		int num_2=sc.nextInt();
		String number=num_1+""+num_2;
		int num=Integer.parseInt(number);
		if(Math.pow((int)Math.sqrt(num),2)==num){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
