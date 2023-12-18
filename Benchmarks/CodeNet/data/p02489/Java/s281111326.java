import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int num = sc.nextInt();
		while(num != 0){
			System.out.println("Case "+ count + ": " + num );
			num = sc.nextInt();
			count++;
		}

	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}