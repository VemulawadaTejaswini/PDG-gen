import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			char[] mes = scan.next().toCharArray();
			int[][] c = new int[n][2];
			for(int j = 0;j < n;j++){
				c[j][0] = scan.nextInt() - 1;
				c[j][1] = scan.nextInt() - 1;
			}
			for(int i = n-1;i >= 0;i--){
				mes[c[i][0]] += (c[i][1] - c[i][0]);
				mes[c[i][1]] += (c[i][1] - c[i][0]);
				while((int)mes[c[i][0]] >= 123){
					mes[c[i][0]] -= 26;
				}
				while((int)mes[c[i][1]] >= 123){
					mes[c[i][1]] -= 26;
				}
				char temp = mes[c[i][0]];
				mes[c[i][0]] = mes[c[i][1]];
				mes[c[i][1]] = temp;
			}
			for(int j = 0;j < mes.length;j++){
				System.out.print(mes[j]);
			}
			System.out.println();
		}
	}
}