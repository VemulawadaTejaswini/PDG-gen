import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while(true){
			boolean flag = true;
			for(int j = 2; j < Math.sqrt(x); j++){
				if(x%j==0){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println(x);
				return;
			}
			x++;
		}



	}

}