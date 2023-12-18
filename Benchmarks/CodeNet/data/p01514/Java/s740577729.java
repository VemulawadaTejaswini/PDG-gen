import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			int t = sc.nextInt();
			int p = sc.nextInt();
			int r = sc.nextInt();
			if(t == 0 && p == 0 && r == 0) break;
			calc(t, p, r);
		}
	}
	public void calc(int t, int p, int r){
		int[][] gotou = new int[t][p];
		int[] seikai = new int[t];
		int[] penalty = new int[t];
		
		for(int i = 0; i < r; i++){
			int tiD = sc.nextInt();
			int piD = sc.nextInt();
			int time = sc.nextInt();
			String line = sc.nextLine();
			String message = line.split(" ")[1];

			if(gotou[tiD-1][piD-1] != -1){
				if(message.equals("WRONG")){
					gotou[tiD-1][piD-1] = gotou[tiD-1][piD-1] + 1;
				}
				else if(message.equals("CORRECT")){
					seikai[tiD-1] = seikai[tiD -1] + 1;
					penalty[tiD-1] = penalty[tiD-1] + (gotou[tiD-1][piD-1] * 1200 + time);
					gotou[tiD-1][piD-1] = -1;
				}
			}
		}
		
		int[] sortedSeikai = new int[t];
		for(int i = 0; i < t; i++) sortedSeikai[i] = i;
		mergesort(sortedSeikai, seikai, penalty);
		
		for(int i = 0; i < t; i++){
			System.out.println((sortedSeikai[i]+1) + " " + seikai[sortedSeikai[i]] + " " + penalty[sortedSeikai[i]]);
		}
		
	}
	public void merge(int[] list1, int[] list2, int[] list,  int[] seikai, int[] penalty){
		int i = 0;
		int j = 0;
		while(i < list1.length || j < list2.length){
			if(j >= list2.length || (i < list1.length && seikai[list1[i]] > seikai[list2[j]])){
				list[i+j] = list1[i];
				i++;
			}
			else if(i < list1.length && j < list2.length && seikai[list1[i]] == seikai[list2[j]]){
				if(penalty[list1[i]] < penalty[list2[j]]){
					list[i+j] = list1[i];
					i++;
				}
				else if(penalty[list1[i]] == penalty[list2[j]] && list1[i] < list2[j]){
					list[i+j] = list1[i];
					i++;
				}
				else if(penalty[list1[i]] == penalty[list2[j]] && list1[i] > list2[j]){
					list[i+j] = list2[j];
					j++;
				}
				else{
					list[i+j] = list2[j];
					j++;
				}
			}
			else{
				list[i+j] = list2[j];
				j++;
			}
		}
	}
	public void mergesort(int[] list, int[] seikai, int[] penalty){
		if(list.length>1){
			int m = list.length/2;
			int n = list.length-m;
			int[] list1 = new int[m];
			int[] list2 = new int[n];
			for(int i = 0; i < m; i++)list1[i] = list[i];
			for(int i = 0; i < n; i++)list2[i] = list[i+m];
			mergesort(list1, seikai, penalty);
			mergesort(list2, seikai, penalty);
			merge(list1, list2, list, seikai, penalty);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}