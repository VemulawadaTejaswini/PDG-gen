
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String [] array = str.split("[ \\.,]+");
		boolean isFirst = true;
		for(int i=0; i < array.length; i++){
			int len = array[i].length();
			if(len >= 3 && len <= 6 ){
				if(isFirst){
					System.out.print(array[i]);
					isFirst = false;
				}
				else{
					System.out.print(" "+ array[i]);
				}
			}
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}