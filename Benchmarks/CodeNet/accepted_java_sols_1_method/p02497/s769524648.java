
import java.util.Scanner;
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
	int m, f, r, sum;
	
	do{
	m = s.nextInt();
	f = s.nextInt();
	r = s.nextInt();
	sum = m+f;
	if(m<=50 && f<=50 && r<=100){
		if(m==-1 || f==-1){
			if(m==-1 && f==-1 && r==-1){
				break;
			}
			System.out.println("F");
		}else
		if(80<=sum){
			System.out.println("A");
		}else if(65<=sum && sum<80){
			System.out.println("B");
		}else if(50<=sum && sum<65){
			System.out.println("C");
		}else if(30<=sum && sum<50){
			if(50<=r){
				System.out.println("C");
			}else{
			System.out.println("D");
			}
		}else if(sum<30){
			System.out.println("F");
		}
	}
	}while(true);
}
}