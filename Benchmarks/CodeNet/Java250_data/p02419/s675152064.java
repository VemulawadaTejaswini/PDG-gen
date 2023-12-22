import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String W=sc.next();
		int count=0;
		String line="";
		while(!(line=sc.next()).equals("END_OF_TEXT")) {
			for(String s:line.split(" ")) {
				if(s.equalsIgnoreCase(W)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
