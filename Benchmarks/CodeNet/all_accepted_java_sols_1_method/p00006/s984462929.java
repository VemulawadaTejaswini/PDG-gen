import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		
		StringBuffer st=new StringBuffer(str);
		String str2=st.reverse().toString();
		
		System.out.println(str2);
		
	}

}
