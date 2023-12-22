import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			long a = scan.nextLong();
			long b = scan.nextLong();
			
			long max = Math.max(a, b);
			long min = Math.min(a, b);
			
			long yakusu = 0;
			long cal = 0;
			
			for(;true;){
				cal = max % min;
				max = min;
				min = cal;
				
				if(min==0){ 
					yakusu = max;
					break;
				}
			}
			
			long baisu = 0;
			baisu = a * b / yakusu;
			
			System.out.println(yakusu+" "+baisu);
		}			
	}
}