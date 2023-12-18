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
			char temp;
			int[][] c = new int[n][2];
			for(int i = 0;i < n;i++){
				c[i][0] = scan.nextInt() - 1;
				c[i][1] = scan.nextInt() - 1;
			}
			for(int i = n-1;i >= 0;i--){
				mes[c[i][0]] = (char)((int)(mes[c[i][0]]) + (c[i][1] - c[i][0]));
				mes[c[i][1]] = (char)((int)(mes[c[i][1]]) + (c[i][1] - c[i][0]));
				if((int)mes[c[i][0]] > 122){
					mes[c[i][0]] = (char)((int)(mes[c[i][0]]) - 26);
				}
				if((int)mes[c[i][1]] > 122){
					mes[c[i][1]] = (char)((int)(mes[c[i][1]]) - 26);
				}
				temp = mes[c[i][0]];
				mes[c[i][0]] = mes[c[i][1]];
				mes[c[i][1]] = temp;
			}
			for(int i = 0;i < mes.length;i++){
				System.out.print(mes[i]);
			}
			System.out.println();
		}
	}
}