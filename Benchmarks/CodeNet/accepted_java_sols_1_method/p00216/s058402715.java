import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==-1)break;
			int sum = 3130;
			if(n<=10){
				System.out.println(sum);
			}else{
				if(n<=20){
					System.out.println(sum-125*(n-10));
				}else{
					sum-=1250;
					if(n<=30){
						System.out.println(sum-140*(n-20));
					}else{
						sum-=1400;
						System.out.println(sum-160*(n-30));	
					}
				}
			}
		}
	
	}	
}