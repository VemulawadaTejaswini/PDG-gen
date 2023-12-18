import java.util.*;
 
class Main{
    public static void main(String[] args){
		long sum;
		Scanner scan = new Scanner(System.in);
		
		while(true){
			sum = 0;
			long num = scan.nextInt();
			if(num == 0){
				break;
			}
			while(num >= 1){
				sum += num % 10;
				num = num / 10;
			}
			System.out.println(sum);
		}
    }
}