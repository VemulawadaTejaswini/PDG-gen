import java.io.PrintWriter;
import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		while(sc.hasNext()){
			String str = sc.nextLine();
			str=str.replaceAll("apple","-");
			str=str.replaceAll("peach", "apple");
			str=str.replaceAll("-","peach");
			System.out.println(str);
		}
	}	
}