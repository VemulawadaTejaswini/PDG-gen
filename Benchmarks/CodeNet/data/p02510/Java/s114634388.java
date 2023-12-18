import java.util.Scanner;
public class Main {
	static int count = 0;
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		
		while(true){
			String s = sc2.nextLine();
			int n = Integer.parseInt(sc2.nextLine());
			for(int i=0;i<n;i++){
				int id = Integer.parseInt(sc2.nextLine());
				s = s.substring(id,s.length()) + s.substring(0,id);
			}
			System.out.println(s);
		}
	}
}