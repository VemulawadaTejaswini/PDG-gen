import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		char[] line=scanner.nextLine().toCharArray();
		StringBuilder builder=new StringBuilder();
		for(char c : line){
			if(0x41<=c && c<=0x5a){
				c+=0x20;
			}else if(0x61<=c && c<=0x7a){
				c-=0x20;
			}
			builder.append(c);
		}
		System.out.println(builder.toString());
	}
}