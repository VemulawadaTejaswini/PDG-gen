import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int [][] list1 = new int[n][w+1];
		int [][] list2 = new int[n][w+1];
		for(int i=0; i < n; i++){
			String [] input = sc.next().split(",");
			int input0 = Integer.parseInt(input[0]);
			int input1 = Integer.parseInt(input[1]);
			list1[i][input0] = input1;
			list2[i][input1] = input0;
		}
		int [] ans = new int[w+1];
		for(int i=1; i <= w; i++){
			int patt = i;
			for(int j=0; j < n; j++){
				if(list1[j][patt] != 0){
					patt = list1[j][patt];
				}
				else if(list2[j][patt] != 0){
					patt = list2[j][patt];
				}
			}
			ans[patt] = i;
		}

		for(int i=1; i <= w; i++){
			System.out.println(ans[i]);
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}