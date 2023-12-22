import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc =new Scanner(System.in);
		int[] dish = new int[5];
		for(int i=0;i<5;i++){
			dish[i] = sc.nextInt();
		}

		int[] point = new int[5];
		int[] ones_place=new int[5];
		for(int i=0;i<5;i++){
			if(dish[i] >=100){
				ones_place[i] = (dish[i]%100)%10;
				if(ones_place[i] == 0)
					ones_place[i] = 10;

					point[i] = dish[i]+10-ones_place[i];
				
			}else if(dish[i]>=10){
					ones_place[i]=dish[i]%10;
					if(ones_place[i] == 0)
					ones_place[i] = 10;

					point[i] = dish[i]+10-ones_place[i];
				}else{
					ones_place[i]=dish[i];
					if(ones_place[i] == 0)
					ones_place[i] = 10;

					point[i] = dish[i]+10-ones_place[i];
				}
		}

		Arrays.sort(ones_place);
		int time=0;

		for(int i=0;i<point.length;i++){
			time=time+point[i];
		}

		System.out.println(time-10+ones_place[0]);
	}
}