import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		for(int i=0; i < n; i++){
			long num = sc.nextInt();
			System.out.println("Case " + count++ +":");
			for(int j=0; j < 10; j++){
				if(num == 0){
					num = 1;
				}
				else{
					num = num * num;
				}
				num = num / 100;
				num = num % 10000;
				System.out.println(num);
			}
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}