import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int sum = 0;
			int size;
			int weight;
			for(int i = 0;i < n;i++){
				size = scan.nextInt() + scan.nextInt() + scan.nextInt();
				weight = scan.nextInt();
				if(size <= 60 && weight <= 2){
					sum += 600;
				}else if(size <= 80 && weight <= 5){
					sum += 800;
				}else if(size <= 100 && weight <= 10){
					sum += 1000;
				}else if(size <= 120 && weight <= 15){
					sum += 1200;
				}else if(size <= 140 && weight <= 20){
					sum += 1400;
				}else if(size <= 160 && weight <= 25){
					sum += 1600;
				}
			}
			System.out.println(sum);
		}
	}
}