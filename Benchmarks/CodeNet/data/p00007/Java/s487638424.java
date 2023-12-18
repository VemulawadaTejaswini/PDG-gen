import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int debt = 100000;
		for(int i=0; i < n; i++){
			debt = debt + (debt * 5 / 100);
			if(debt % 1000 == 0){
				debt = (debt / 1000) * 1000;
			}
			else{
				debt = (debt / 1000 + 1) * 1000;
			}
		}

		System.out.println(debt);

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}