import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int[] s = new int[n];
			for(int i = 0;i < n;i++){
				s[i] = scan.nextInt();
			}
			int q = scan.nextInt();
			int[] t = new int[q];
			for(int i = 0;i < q;i++){
				t[i] = scan.nextInt();
			}
			int count = 0;
			for(int i = 0;i < q;i++){
				for(int j = 0;j < n;j++){
					if(t[i] == s[j]){
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}