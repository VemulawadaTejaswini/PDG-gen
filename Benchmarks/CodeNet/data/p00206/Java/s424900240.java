import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int tripCost = stdIn.nextInt();
			if(tripCost == 0)break;
			for(int i=1;i<=13;i++){
				if(i==13){
					System.out.println("NA");
				}else{
					int income = stdIn.nextInt();
					int payOut = stdIn.nextInt();
					int savingMoney =  + income - payOut;
					if(savingMoney >= tripCost){
						System.out.println(i);
						break;
					}
				}
			}
		}
	}
}