import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String[] array = s.split("/");
		s = "2018/"+array[1]+"/"+array[2];
		System.out.print(s);
	}
}
