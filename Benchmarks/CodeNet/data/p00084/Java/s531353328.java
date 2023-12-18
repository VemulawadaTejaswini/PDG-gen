
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc1 = new Scanner(System.in);
		Scanner sc = new Scanner(sc1.nextLine());
		sc.useDelimiter("[ \\.,\\n]+");
		while(sc.hasNext()){
			String str = sc.next();
			int len = str.length();
			if(len >= 3 && len <= 6){
				if(sc.hasNext()){
					System.out.print(str.trim() + " ");
				}
				else{
					System.out.println(str.trim());
				}
			}

		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}