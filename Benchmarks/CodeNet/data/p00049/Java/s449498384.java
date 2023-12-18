import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter(",");
		int a=0,b=0,o=0,ab=0;
		while(sc.hasNext()){			
			int num = sc.nextInt();
			switch(sc.next()){
			case "A": a++; break;
			case "B": b++; break;
			case "O": o++; break;
			case "AB": ab++; break;		
			}
		}
		System.out.println(a+"\r\n"+b+"\r\n"+o+"\r\n"+ab);
	}
}