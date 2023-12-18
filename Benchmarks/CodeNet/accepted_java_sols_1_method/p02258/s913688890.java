import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int counter;
		counter=in.nextInt();
		int seller,buyer,temp,diff;
		seller=0;
		int pri=0;
		diff=Integer.MIN_VALUE;
		buyer=Integer.MAX_VALUE;
		//long start=System.currentTimeMillis();
		for(int i=0;i<counter;i++) {
			temp=in.nextInt();
			if(i!=0 && diff<temp-pri)
				diff=temp-pri;
			if (temp< buyer && i<counter-1) {
				buyer = temp;
				seller = 0;
				pri=temp;
				continue;
			}
			if (temp>seller) {
				seller = temp;
			}
			if (seller !=0 && diff< seller-buyer) {
				diff= seller - buyer;
			}
			pri=temp;
		}
		System.out.println(diff);
	}
}
