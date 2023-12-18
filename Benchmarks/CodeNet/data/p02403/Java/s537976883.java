import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			for(int i=0; i<2; i++){
				int a=sc.nextInt();
				int b=sc.nextInt();
				if(a==0){
					break;
				}
				square(a,b);
				System.out.println();
			}
		}











	}
	public static void square(int a,int b){
		for(int i=0; i<a; i++){
			for(int j=0; j<b; j++){
				System.out.print("#");
			}
			System.out.println();
		}
	}



}
