import java.util.*;
public class Main {

	int n;
	public void doIt(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n == 0){
			System.out.println(1);
		}
		else{
			System.out.println(n*n*n);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
        obj.doIt();

	}
}