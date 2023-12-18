import java.util.Scanner;
class Main{
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
		int point, sum, num;
		while(scan.hasNext()){
			num = scan.nextInt();
			int[] search = new int[num + 1];
			point = 2;
			sum = 0;
			while(point <= num){
				if(search[point] == 0){
					sum++;
					for(int i = point; i <= num; i+=point){
						search[i]++;
					}
				}
				point++;
			}
			System.out.println(sum);
		}
	}
}