import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str[];
		while(true){
			str=sc.nextLine().split(" ");
			if(str[0].equals("END") && str[1].equals("OF") && str[2].equals("INPUT")) break;
			for(int i=0;i<str.length;i++){
				System.out.print(str[i].length());
			}
			System.out.println();
		}
	}
}