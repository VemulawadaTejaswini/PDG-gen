import java.util.Scanner;

public class Main {
	public static void main(String[] age){

		while(true){
			Scanner sb = new Scanner(System.in);
			String imput = sb.nextLine();
			String[] imputarray = imput.split(" ");
			int a = Integer.parseInt(imputarray[0]);
			int b = Integer.parseInt(imputarray[2]);
			if(  imputarray[1].equals("+") ){
				System.out.println(a+b);
			}else if( imputarray[1].equals("-")){
				System.out.println(a-b);
			}else if( imputarray[1].equals("*")){
				System.out.println(a*b);
			}else if( imputarray[1].equals("/")){
				System.out.println(a/b);
			}else break;
		}
	}
}