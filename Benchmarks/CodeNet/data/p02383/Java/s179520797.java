import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] d = new int[6];
		
		Dice dice=new Dice();

		for (int i = 0; i < 6; i++) {
			d[i] = scanner.nextInt();
			dice.num[i]=d[i];
		}
		

		String order = scanner.next();

		dice.Roll(order);


System.out.println(dice.num[0]);
		scanner.close();
	}
}


class Dice {
	int num [];
	Dice(){
		num= new int[6];
	}	
	int box=0;
	
	public void Roll(String order) {
		char[] o = new char[order.length()];

		for (int i = 0; i < order.length(); i++) {

			o[i] = order.charAt(i);

		}
		for(int i = 0; i < order.length(); i++) {

			switch(String.valueOf(o[i])){
			
			case "S" :
				
				box=num[0];
				num[0]=num[4];
				num[4]=num[5];
				num[5]=num[1];
				num[1]=box;
			
				
				break;
				
			case "N" :
				
				box=num[0];
				num[0]=num[1];
				num[1]=num[5];
				num[5]=num[4];
				num[4]=box;
				
				
				break;
				
			case "W" :
				
				box=num[0];
				num[0]=num[2];
				num[2]=num[5];
				num[5]=num[3];
				num[3]=box;
				
				
				break;
				
			case "E":
				

				box=num[0];
				num[0]=num[3];
				num[3]=num[5];
				num[5]=num[2];
				num[2]=box;
				
				
				break;
			
			}


		}
	}


}

