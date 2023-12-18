import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(sc.hasNext()){
			int num = sc.nextInt();
			for(int i = 2 ; i <= num ; i++){
				for (int j = 2 ; j <= i  ; j++){
					if(i == j){
						count++;
					}else if(i % j == 0){
						break;
					}
				}
			}
			System.out.println(count);
			count = 0 ;

		}
		
		
		
		
		
		sc.close();
	}

}