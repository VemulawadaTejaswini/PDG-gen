import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 0 , taroPo = 0 , hanakoPo = 0 ;
		while(i != n){
			i++;
			String taro = scan.next();
			String hanako = scan.next();
			
			if(taro.compareTo(hanako) < 0) hanakoPo += 3;
			else if(taro.compareTo(hanako) > 0) taroPo += 3;
			else { 
				taroPo ++;
				hanakoPo ++;
			}
		}
		
		System.out.println(taroPo + " " + hanakoPo);
		
	}

}