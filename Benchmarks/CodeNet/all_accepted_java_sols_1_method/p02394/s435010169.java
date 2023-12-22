import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] list = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};

		if(list[0] >= list[2]+list[4] && list[1]>= list[3]+list[4] && list[2]-list[4] >=0 && list[3]-list[4] >=0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
