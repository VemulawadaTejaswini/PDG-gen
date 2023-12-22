import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner n=new Scanner(System.in);
		
		int start = n.nextInt();
		int end = n.nextInt();
		int num = n.nextInt();
		int cnt = 0;
		
		for (int a = start;a<=end;a++){
			
			if ((num % a) == 0){
				cnt=cnt+1;
			}
		}
		System.out.println(cnt);
	}

}