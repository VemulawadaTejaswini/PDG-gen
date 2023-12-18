import java.util.Scanner;


public class Test {
	public static void main(String[] args){
		Scanner scan = null;
		try{
			int num;
			int[] prime = new int[10000];
			prime[0] = 2;
			for(int i = 3 ,j = 1;j <prime.length;i += 2){
				boolean check = false;
				for(int k = 3; k < i /2; k += 2){
					if(i % k ==0){
						check = true;
						break;
					}
				}
				if(!check){
					prime[j] = i;
					j++;
				}
			}
			for(scan = new Scanner(System.in);(num = scan.nextInt()) !=0;){
				int sum = 0;
				for(int i = 0; i < num;i++){
					sum += prime[i];
				}
				System.out.println(sum);
			}
		}finally{
			if(scan !=null)scan.close();
		}
	}
}