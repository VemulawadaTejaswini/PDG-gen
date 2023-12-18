import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int sum = 0;
		int time[] = new int[5];
		int amari[] = new int[5];
		
		for(int i=0; i< 5; i++){
			time[i] = keyboard.nextInt();
			amari[i] = time[i]%10;
			sum += ((time[i]  +9)/10)*10;
		}
		
		Arrays.sort(amari);
		
		int ans = 10;
        for(int j = 0; j <5; j++){
        	if(amari[j] != 0){
	        	ans = amari[j];
		        break;
				}
			}
			
		System.out.println(sum - (10-ans));
		keyboard.close();	
	}
}
