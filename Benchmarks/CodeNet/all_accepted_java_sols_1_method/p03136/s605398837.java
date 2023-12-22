import java.util.Scanner;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int sum = 0;
		int max = 0;
		for(int i = 0; i < n; i++){
			int l = scan.nextInt();
			sum+=l;
			if(max < l) max = l;
		}
		//		System.err.println(max);
		String ret = ((sum - max) > max) ? "Yes":"No";
		System.out.println(ret);
		
	}
}
