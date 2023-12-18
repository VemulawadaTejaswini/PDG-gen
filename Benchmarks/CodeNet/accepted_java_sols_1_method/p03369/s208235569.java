import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String[] array = s.split("");
		int kingaku = 700;
		for(int i = 0; i < s.length(); i++){
			if(array[i].equals("o")){
				kingaku += 100;
			}
		}
		System.out.println(kingaku);
	}
}