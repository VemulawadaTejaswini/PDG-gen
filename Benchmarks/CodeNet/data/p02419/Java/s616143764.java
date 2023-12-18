import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		final Scanner sc = new Scanner(System.in);
		String key=sc.nextLine();
		int count = 0;
		while(true){
			String[] str=sc.nextLine().toLowerCase().split(" ");
			if(str[0].equals("end_of_text")) break;
			for(String s:str){
				if(s.equals(key)) count++;
			}
		}
		System.out.println(count);
	}
}