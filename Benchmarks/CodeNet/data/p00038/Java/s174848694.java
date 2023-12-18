
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		while(stdIn.hasNext()){
			String str = stdIn.nextLine();
			int[] number = new int[5];
			int[] count = new int[14];
			int j = 0;
			for(int i=0;i<str.length();i++){
				if('0'<=str.charAt(i) && str.charAt(i)<='9'){
					number[j]=number[j]*10;
					number[j]+=(int)str.charAt(i)-(int)'0';
				}
				else{
					j++;
				}
			}
			
			Arrays.sort(number);
			j=0;
			int k=0;
			int count_x =0;
			while(k<number.length){
				if(number[k]==j){
					count[j]++;
					if(0<k){
						if(number[k]-number[k-1]==1){
							count_x++;
						}
						else{
							count_x=0;
						}
					}
					k++;
				}
				else{
					j++;
				}
			}
			int count_3 = 0;
			int count_2 = 0;
			for(int i=0;i<14;i++){
				if(count[i]==4){
					System.out.println("four card");
					break;
				}
				else if(count[i]==3){
					count_3++;
				}
				else if(count[i]==2){
					count_2++;
				}
				if(count_3==1&&count_2==1){
					System.out.println("full house");
					break;
				}
				else if(i==12){
					if(count_x == 4 || (count_x == 3 && number[0]==1)){
						System.out.println("straight");
						break;
					}
					else if(count_3==1){
						System.out.println("three card");
						break;
					}
					else if(count_2==2){
						System.out.println("two pair");
						break;
					}
					else if(count_2==1){
						System.out.println("one pair");
						break;
					}
					else{
						System.out.println("null");
						break;
					}
				}
			}
				
			
			
			
		}
	}
}