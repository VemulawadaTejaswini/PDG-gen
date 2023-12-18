import java.util.Scanner;
class Main{
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
		int point, sum, num;
		while(scan.hasNext()){
			num = scan.nextInt();
			int[] prime = new int[num / 2 + 1];
			sum = 0;
			for(int i = 2; i <= num; i++){
				for(point = 0; point < sum; point++){
					if(i % prime[point] == 0)break;
				}
				if(point == sum){
					prime[point] = i;
					sum++;
				}
			}
			System.out.println(sum);
		}
	}
}