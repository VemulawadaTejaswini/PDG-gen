import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		String[] str = {"2 1 1","1 2 1","1 1 2"};
		while(scan.hasNext()){
			int p = scan.nextInt() + scan.nextInt() + scan.nextInt();
			if(p == 0){
				break;
			}
			int n = scan.nextInt();
			int[][] l = new int[n][4];
			int[] ch = new int[p];
			Arrays.fill(ch,2);
			for(int i = 0;i < n;i++){
				l[i][0] = scan.nextInt() - 1;
				l[i][1] = scan.nextInt() - 1;
				l[i][2] = scan.nextInt() - 1;
				l[i][3] = scan.nextInt();
				if(l[i][3] == 1){
					ch[l[i][0]] = 1;
					ch[l[i][1]] = 1;
					ch[l[i][2]] = 1;
				}
			}
			String t = "";
			for(int i = 0;i < n;i++){
				if(l[i][3] == 1){
					continue;
				}
				t = ch[l[i][0]] + " " + ch[l[i][1]] + " " + ch[l[i][2]];
				for(int j = 0;j < 3;j++){
					if(str[j].equals(t)){
						for(int k = 0;k < 3;k++){
							if(ch[l[i][k]] == 2){
								ch[l[i][k]] = 0;
							}
						}
					}
				}
			}
			for(int i = 0;i < p;i++){
				System.out.println(ch[i]);
			}
		}
	}
}