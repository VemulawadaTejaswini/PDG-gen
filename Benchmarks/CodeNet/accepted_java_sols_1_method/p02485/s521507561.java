import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while(true){
			String s=scanner.nextLine();
			if(s.equals("0")) break;

			char[] num=s.toCharArray();
			int sum=0;
			for(char c:num){
				sum+=Integer.parseInt(Character.toString(c));
			}
			System.out.println(sum);
		}
	}

}