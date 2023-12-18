import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		if(s.charAt(0)==s.charAt(s.length()-1)){
			if((s.length()-2)%2==0){
				System.out.println("First");
			}else{
				System.out.println("Second");
			}
		}else{
			if((s.length()-2)%2==0){
				System.out.println("Second");
			}else{
				System.out.println("First");
			}
		}
	}
}