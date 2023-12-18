import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		 
		 while(true){
			 String s1 = sc.nextLine();
			 String[] s2 = s1.split("[\\s]+");
			 Integer a = new Integer(s2[0]);
			 Integer b = new Integer(s2[1]);
			 if(a != 0 && b != 0){
				 if(a<b) System.out.println(a+" "+b);
				 else if(a>b) System.out.println(b+" "+a);
				 else if(a.equals(b))  System.out.println(a+" "+b);
			 }else{
				 break;
				 }
		 }
	}
}