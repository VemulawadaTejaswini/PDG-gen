import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int baggageNum = stdIn.nextInt();
			if(baggageNum == 0)break;
			int cost = 0;
			for(int i=0;i < baggageNum;i++){
				int size = 0;
				for(int j=0;j<3;j++)size += stdIn.nextInt();
				int w = stdIn.nextInt();
				if(size <= 60 && w <= 2){
					cost += 600;
				}else if(size <= 80 && w <= 5){
					cost += 800;
				}else if(size <= 100 && w <= 10){
					cost += 1000;
				}else if(size <= 120 && w <= 15){
					cost += 1200;
				}else if(size <= 140 && w <= 20){
					cost += 1400;
				}else if(size <= 160 && w <= 25){
					cost += 1600;
				}
			}
			System.out.println(cost);
		}
	}
}