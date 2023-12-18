import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
//		System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		int times = scan.nextInt();
		int num[] =new int[times];
		String cards[] = new String[times];
		String[] bubbleCards =new String[times];
		int bubbleNum[] = new int[times];
		int temp = 0;
		String tempSt = "";
		int min = 0;
		int banchi = 0;
		int finir = 0;
		int irekae = 0;
		int i = 0;
		char suit = ' ';
		
		for(i=0;i<times;i++){
			cards[i] = scan.next();
		}
		for(i=0;i<times;i++){
			suit = cards[i].charAt(1);
			num[i] = Character.getNumericValue(suit);
		}
		i = 0;
		
//		??????????????????
		bubbleNum = num.clone();
		bubbleCards = cards.clone();
		for(i=0;i<times;i++){
			for(int j=times-1;j>i; j--){
				if(bubbleNum[j] < bubbleNum[j-1]){
					temp = bubbleNum[j];
					bubbleNum[j] = bubbleNum[j-1];
					bubbleNum[j-1] = temp;
					tempSt = bubbleCards[j];
					bubbleCards[j] = bubbleCards[j-1];
					bubbleCards[j-1] = tempSt;
				}
			}
		}
//		???????????????????????? ??????????????¶???Stable
		
		for(i=0;i<times;i++){
			System.out.print(bubbleCards[i]);
			if(i == times-1){
				System.out.println("");
				System.out.println("Stable");
			}
			else{
				System.out.print(" ");
			}
		}
		
		
//		?????¬????????§????????????
		for(i=0;i<times;i++){
			min = i;
			for(int j=i;j<times;j++){
				if(num[j] < num[min]){
					min = j;
				}
			}
			temp = num[i];
			num[i] = num[min];
			num[min] = temp;
			tempSt = cards[i];
			cards[i] = cards[min];
			cards[min] = tempSt;
		}
//		?????¬????????§??????????????????
		for(i=0;i<times;i++){
			System.out.print(cards[i]);
			if(i == times-1){
				System.out.println("");
			}
			else{
				System.out.print(" ");
			}
		}
		
		
//		???????????¨?????¬????????§????????????
		boolean tf = true;
		for(i=0; i<times;i++){
			if(bubbleCards[i] != cards[i]){
				System.out.println("Not stable");
				tf = false;
				break;
			}
		}
		if(tf == true){
			System.out.println("Stable");
		}
	}
}