import java.util.Scanner;
class Main{
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
		int point, sum, num;
		while(scan.hasNext()){
			num = scan.nextInt();
			if(num == 1)System.out.println(1);
			else{
				int[] prime = new int[num / 2 + 1];
				prime[0] = 2;
				sum = 1;
				for(int i = 3; i <= num; i+=2){
					for(point = 1; point < sum; point++){
						if(i % prime[point] == 0)break;
					}
					if(point == sum){
						prime[sum] = i;
						sum++;
					}
				}
				System.out.println(sum);
			}
		}
	}
}