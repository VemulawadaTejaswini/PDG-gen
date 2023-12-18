import java.util.Scanner;

public class Main09{
	public static void main(String[] args){
	    while(true){
		Scanner in = new Scanner(System.in);
		String x = in.nextLine();
		int a = Integer.parseInt(x);
		int n =0;
		int[] p = new int[(a+1)];
		int[] q = new int[(a+1)];
		for(int i =1;i<=a;i++){
			for(int j=1;j<i;j++){
				if(i%j == 0){
					p[i] += 1;
				}else{
					q[i] += 1;
				}
			}
		}
		for(int i =1;i<=a;i++){
			if(p[i] == 1){
				n += 1;
			}
		}
		System.out.println(n);
	    }
	}
}