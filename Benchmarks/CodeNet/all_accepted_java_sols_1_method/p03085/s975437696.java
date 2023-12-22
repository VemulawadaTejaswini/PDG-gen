import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		if(s.equals("A")){
			System.out.println("T");
		}else if(s.equals("T")){
			System.out.println("A");
		}else if(s.equals("C")){
			System.out.println("G");
		}else{
			System.out.println("C");
		}
	}
}
