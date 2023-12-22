import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
//		System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		int num[] =new int[times];
		int temp = 0; 
		int finir = -1;
		int irekae = 0;
		int i = 0;
		for(i=0;i<times;i++){
			num[i] = scan.nextInt();
		}
		i = 0;
		int bot = num.length-1;
		int pre = bot-1;
		while (times != 1){
			if(num[pre - i] > num[bot -i]){//???????°?2????????????????°?????????\????????????
//				System.out.println("irekae"+num[pre-i]+" "+num[bot-i]);
				temp = num[bot-i];
				num[bot-i] = num[pre-i];
				num[pre-i] = temp;
				irekae += 1;
			}
			
			i += 1;
			
			if(finir == pre-i){//???-1????????????????????\?????????????°??????????
				finir += 1;
//				System.out.println("finir "+finir);
				if(finir == num.length-2){
					break;
				}
				i = 0;
			}
		}
		for(i=0;i<times;i++){
			System.out.print(num[i]);
			if(i == times-1){
				System.out.println("");
				System.out.println(irekae);
			}
			else{
				System.out.print(" ");
			}
			
		}
	}
}