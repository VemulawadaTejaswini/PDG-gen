import java.util.*;
import java.awt.geom.*;
public class Main {
	
	private void doit(){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while(n-- > 0){
			String s = sc.nextLine();
			System.out.println(s.replaceAll("Hoshino", "Hoshina"));
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}