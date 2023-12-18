import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			System.out.println(new StringBuilder(sc.next()).reverse().toString());
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}