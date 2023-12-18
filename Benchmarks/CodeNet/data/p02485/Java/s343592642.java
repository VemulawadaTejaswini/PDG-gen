import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x,total;
		while(true){
			x = sc.nextInt();
			if(x==0) break;
			total = 0;
			while(x!=0){
				total += x-(x/10)*10;
				x /= 10;
			}
			System.out.println(total);
		}
	}

}