import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int s = sc.nextInt();
			if(s == 0) break;
			int[] n = new int[s];
			int[] p = new int[s];
			int[] q = new int[s];
			int[] sells = new int[s];
			boolean[] judge = new boolean[s];
			int count = 0;

			for(int i= 0; i < s; i++){
				n[i] = sc.nextInt();
				p[i] = sc.nextInt();
				q[i] = sc.nextInt();
				sells[i] = p[i] * q[i];
				if(sells[i] >= 1000000){
					judge[i] = true;
					count++;
				}else{
					judge[i] = false;
				}
			}

			for(int i = 0; i < s; i++){
				if(judge[i]){
					System.out.println(n[i]);
				}
			}

			if(count == 0) System.out.println("NA");
		}
	}
}