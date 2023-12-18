import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	for (int i = 0 ;; i++) {
	Scanner sc= new Scanner(System.in);
	String str = sc.next(); 
    String array[]=new String[3];
    array = str.split(" ");
	int a=Integer.parseInt(array[0]);
	String o = array[1];
	int b=Integer.parseInt(array[2]);
	
		if (o.equals("?")){
			break;
		}else if(o.equals("+")){
			System.out.println(a+b);

		}else if(o.equals("-")){
			System.out.println(a-b);

		}else if(o.equals("*")){
			System.out.println(a*b);

		}else if(o.equals("/")){
			System.out.println(a/b);
		}
}
}
}