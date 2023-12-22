import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] food = new int[5];
		food[0] = scan.nextInt();
		food[1] = scan.nextInt();
		food[2] = scan.nextInt();
		food[3] = scan.nextInt();
		food[4] = scan.nextInt();
		int min = 10;
		int minNum = 0;
		int total = 0;
		int t = 0;
		for(int i=0;i<5;i++){
			if(min>food[i]%10){
				if(food[i]%10!=0){
				min = food[0]%10;
				minNum = i;
			}
			}
		}
		for(int j=0;j<5;j++){
			if(j==minNum){
				total = total + food[j];
			}
			else{
				t=food[j]/10;
				if(food[j]%10==0){total = total + t*10;
				}
				else{total = total + (t+1)*10;}
			}
		}
		System.out.println(total);
	}
}