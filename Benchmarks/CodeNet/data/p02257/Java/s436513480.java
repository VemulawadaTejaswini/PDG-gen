import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
//		System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		int num[] =new int[times];
		int keisan = 0;
		int sosu = times;
		for(int i=0;i<times;i++){
			num[i] = scan.nextInt();
		}
		
		for(int i=0;i<times;i++){
			for (int ii=2;ii<num[i]; ii++){
				keisan = 0;
				keisan = num[i] % ii ;
				if (keisan == 0){
					sosu -= 1;
					break;
				}
			}
		}
		System.out.println(sosu);
	}
}