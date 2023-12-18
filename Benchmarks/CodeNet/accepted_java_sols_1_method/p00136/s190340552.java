import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count[] = new int[6];
		for(int i = 0 ; i < n ; i++){
			double h = scan.nextDouble();
			if(h < 165.0){
				count[0] +=1;
			}else if(h < 170.0){
				count[1] +=1;
			}else if(h < 175.0){
				count[2] +=1;
			}else if(h < 180.0){
				count[3] +=1;
			}else if(h < 185.0){
				count[4] +=1;
			}else{
				count[5] +=1;
			}
		}
		for(int i = 0 ; i < 6 ; i++){
			System.out.print((i+1)+":");
			for(int j = 0 ; j < count[i] ; ++j){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}