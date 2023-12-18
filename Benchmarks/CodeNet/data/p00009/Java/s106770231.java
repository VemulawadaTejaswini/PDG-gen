import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int s[] = new int[num];
		int count=1;
		while(scan.hasNext()){	
			for(int b=2;b<=num;b++)
				count++;
			for(int i=2;i<Math.sqrt(num);i++){
				for(int j=2;j*i<=num;j++){
					count--;
				}
			}
			System.out.println(count);
			count=1;
		}
	}	
}