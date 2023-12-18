import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] dish = new int[5];
		boolean[] t = new boolean[5];
		int max = 0;
		int min = 0;
		int time = 0;
		Scanner sc = new Scanner(System.in);
		//최대 최소 인덱스 구함
		for (int i = 0; i < dish.length; i++) {
			dish[i] = sc.nextInt();
			if(dish[i]%10==0)
				continue;
			max = dish[max]%10>dish[i]%10?max:i;
			min = dish[min]%10<dish[i]%10?min:i;
		}
		if(max == min){
			max = 0;
			min = 4;
		}
		t[max] = t[min] = true;
		
		time += (int)Math.ceil((double)dish[max]/10)*10;
		for (int i = 0; i < 5; i++) {
			if(!t[i])
				time += (int)Math.ceil((double)dish[i]/10)*10;
		}
		time += dish[min];
		
		System.out.println(time);
	}

}