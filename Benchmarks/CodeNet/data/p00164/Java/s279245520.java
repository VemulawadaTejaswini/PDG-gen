import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int ohajiki = 32;
			int[] a = new int[n];
			for(int i = 0;i < n;i++){
				a[i] = scan.nextInt();
			}
			boolean turn = true;
			int count = 0;
			while(ohajiki > 1){
				if(turn){
					ohajiki -= (ohajiki-1)%5;
				}else{
					ohajiki -= a[count%n];
					count++;
				}
				System.out.println(ohajiki);
				turn ^= true;
			}
			System.out.println(0);
		}
	}
}