import java.util.Scanner;

public class Main {
	public static void main(String[] age){

		StringBuilder br = new StringBuilder();

		while(true){
			Scanner sb = new Scanner(System.in);
			String imput = sb.nextLine();
			String[] imputarray = imput.split(" ");
			int a = Integer.parseInt(imputarray[0]);
			int b = Integer.parseInt(imputarray[2]);
			int c = 0;
			if(  imputarray[1].equals("+") ){
				c = a+b;
			}else if( imputarray[1].equals("-")){
				c = a-b;
			}else if( imputarray[1].equals("*")){
				c = a*b;
			}else if( imputarray[1].equals("/")){
				c = a/b;
			}
			if( imputarray[1].equals("?") ) break;
			br.append(Integer.toString(c)).append("\n");
		}
		System.out.println(br);
	}
}