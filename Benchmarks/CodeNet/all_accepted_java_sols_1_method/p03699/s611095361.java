import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String args[]){

		Scanner cin = new Scanner(System.in);

		int target = cin.nextInt();
		int list[] = new int[target];
		int sum = 0;
		for(int i=0;i<target;i++){
			list[i] = cin.nextInt();
			sum += list[i];
		}

		if(sum%10!=0){
			System.out.println(sum);
		}else{
			Arrays.sort(list);
			for(int j=0;j<target;j++){
				if(list[j]%10!=0){
					sum-=list[j];
					break;
				}
			}
			if(sum%10==0){
				System.out.println(0);
			}else{
				System.out.println(sum);
			}
		}
	}
}
