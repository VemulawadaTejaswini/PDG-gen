import java.util.ArrayList;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int obj = sc.nextInt();
			if(obj > 1023) break;
			int sum = 0;
			boolean bj = false;
			ArrayList<Integer> al = new ArrayList<>();
			for(int i = 1; i <= 512; i *= 2){
				if(obj == i){
					System.out.println(i);
					bj = true;
					break;
				}
			}
			for(int i = 512; i >= 1; i /= 2){
				if(bj) break;
				if(i < obj & (i/2) + sum != obj & (i/2/2) + sum != obj & (i/2/2/2) + sum != obj){
					sum += i;
					al.add(i);
				}
				if(obj == sum){
					break;
				}
			}
			for(int i = 0; i < al.size(); i++){
				System.out.print(al.get(al.size()-i-1) + " ");
			}
			System.out.println();
		}
	}
}