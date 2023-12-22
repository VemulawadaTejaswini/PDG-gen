import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		boolean flg = false;
		for(int i = 1;i<10;i++){
			for(int j = 1;j<10;j++){
				if(i*j ==n){
					flg = true;
				}
			}
		}
if(flg){
    System.out.println("Yes");
}else{
	System.out.println("No");
}
	}
}