import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}else if(n == 1){
				for(int i = 0;i < 10;i++){
					if(i == scan.nextInt()){
						System.out.println("*");
					}else{
						System.out.println("-");
					}
				}
				continue;
			}
			int[] ice = new int[10];
			for(int i = 0;i < n;i++){
				ice[scan.nextInt()]++;
			}
			for(int i = 0;i < 10;i++){
				if(ice[i] == 0){
					System.out.print("-");
				}else{
					for(int j = 0;j < ice[i];j++){
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
	}
}