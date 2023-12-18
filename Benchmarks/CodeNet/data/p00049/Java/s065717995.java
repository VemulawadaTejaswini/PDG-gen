import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(",");
		int a=0,b=0,o=0,ab=0;
		while(sc.hasNext()){			
			int num = sc.nextInt();
			String s = sc.next();
			if(s.equals("A"))
				a++; 
			if(s.equals("B"))
				b++; 
			if(s.equals("O"))
				o++; 
			if(s.equals("AB"))
				ab++; 
		}
		System.out.println(a+"\r\n"+b+"\r\n"+o+"\r\n"+ab);
	}
}