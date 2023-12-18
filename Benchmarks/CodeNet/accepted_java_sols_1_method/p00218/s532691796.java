import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		int n;
		ArrayList<String> rank;
		int[] score = new int[3];
		Scanner sc = new Scanner(System.in);
		double tmp;
		
		while(true){
			n = sc.nextInt();
			if(n == 0){
				break;
			}
			rank = new ArrayList<String>();
			
			for(int i=0;i<n;i++){
				for(int j=0;j<3;j++){
					score[j] = sc.nextInt();
				}
				
				if(score[0]==100 || score[1]==100 || score[2]==100){
					rank.add("A");
				}else if((score[0]+score[1])/2.0 >= 90){
					rank.add("A");
				}else if((score[0]+score[1]+score[2])/3.0 >= 80){
					rank.add("A");
				}else if((score[0]+score[1]+score[2])/3.0 >= 70){
					rank.add("B");
				}else if((score[0]+score[1]+score[2])/3.0 >= 50){
					if(score[0]>=80 || score[1]>=80){
						rank.add("B");
					}else{
						rank.add("C");
					}
				}else{
					rank.add("C");
				}
			}
			
			for(int i=0;i<n;i++){
				System.out.println(rank.get(i));
			}
		}
		
	}
}