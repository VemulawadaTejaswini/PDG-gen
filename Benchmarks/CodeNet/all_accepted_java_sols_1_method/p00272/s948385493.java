import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		int Su[] ={0,6000,4000,3000,2000};
		int Ke[] ={0,0,0,0};
		for(int i = 0; i < 4; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			Ke[i] = Su[a] * b;
		}
		for(int n = 0; n < 4; n++){
			System.out.println(Ke[n]);
		}
	}
}