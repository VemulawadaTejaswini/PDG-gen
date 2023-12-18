import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(scan.hasNext()){
			String s=scan.nextLine();
			String[] l=s.split(" ");
			System.out.println(l[0].length()+l[1].length());
			}
	}
}