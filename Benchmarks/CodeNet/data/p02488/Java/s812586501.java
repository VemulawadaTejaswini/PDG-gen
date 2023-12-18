//«®ÅæªÉÈéàÌðoÍ·évO
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String first = sc.next();
		for(int i=1; i< n;i++){
			String temp = sc.next();
			for(int j=0;j < first.length() && j < temp.length(); j++){
				if(first.charAt(j) > temp.charAt(j)){
					first = temp;
					break;
				}
				else if(first.charAt(j) < temp.charAt(j)){
					break;
				}
				else{}
			}
		}
		System.out.println(first);
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}