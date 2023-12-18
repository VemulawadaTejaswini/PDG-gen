import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			if(a == 0){break;}
			int total = 0;
			int syo = 1000;
			int dai = 0;

		for(int n = 0; n < a; n++){
			int tmp = sc.nextInt();
			total = total + tmp;
			if(tmp < syo){
				 syo = tmp;
			}else if(tmp > dai){
				dai = tmp;
			}
		}
		double heikin = (total - syo - dai)/(a - 2);
		System.out.println((int)heikin);

		}

	}
}
		
