import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int tresult = 0;
		int hresult = 0;

		for(int i = 0; i < n; i++){
			String taro = scan.next();
			String hanako = scan.next();

			if(taro.compareTo(hanako) == 0){
				tresult++;
				hresult++;
			}else if(taro.compareTo(hanako) < 0){
				hresult += 3;
			}else if(taro.compareTo(hanako) > 0){
				tresult += 3;
			}
		}
		System.out.println(tresult + " " + hresult);
	}

}