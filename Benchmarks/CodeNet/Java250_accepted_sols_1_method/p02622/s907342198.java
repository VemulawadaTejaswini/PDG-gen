import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);// TODO Auto-generated method stub
		String s=input.next();
		String t=input.next();
		char[] s1=s.toCharArray();
		char[] t1=t.toCharArray();
		int suma=0;
		for(int i=0;i<s.length();i++) {
			if(s1[i]!=t1[i]) {
				suma++;
			}
		}
		System.out.println(suma);
			
	}

}
