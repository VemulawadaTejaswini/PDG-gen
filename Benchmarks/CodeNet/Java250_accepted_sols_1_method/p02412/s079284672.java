import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		try{
			scan = new Scanner(System.in);
			while(true){
				int n = scan.nextInt();
				int x = scan.nextInt();
				if(n == 0 && x == 0 )break;
				int counter =0;
				for(int i = 1 ;i <= n;i++){
					for(int j = i +1 ; j <= n ; j++){
						for(int k = j + 1; k <= n ; k++){
							if(i + j + k == x)counter++;
						}
					}
				}
				System.out.println(counter);
			}
		}finally{
			if(scan !=null)scan.close();
		}
	}
}