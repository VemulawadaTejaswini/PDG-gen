import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		int n = Integer.parseInt(sc2.nextLine());
		String min = "zzzzzzzzzzzzzzzzzzzz";
		for(int i=0;i<n;i++){
			String s = sc2.nextLine();
			if(s.compareTo(min)<0) min =s;
		}
		System.out.print(min);
	}
}