import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			calc(n, m);
	}
	double[][] nums ;
	public void calc(int n, int m){
		ArrayList<double[]> list = new ArrayList<double[]>();
		nums = new double[n][n];
		for(int i = 0; i < n; i++){
			double l = sc.nextDouble();
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			list.add(new double[]{l,a,b});
		}
		
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				double[] item1 = list.get(i);
				double[] item2 = list.get(j);
				nums[i][j] = (item1[0] - item2[0]) * (item1[0] - item2[0]) + 
						(item1[1] - item2[1]) * (item1[1] - item2[1]) + 
						(item1[2] - item2[2]) * (item1[2] - item2[2]);
				nums[j][i] = nums[i][j];
			}
		}
		
		
		
		maxcal(0, new int[m], m, n, 0);
		System.out.println(sum);
	}
	double sum = 0;

	public void maxcal(int k, int[] t , int m, int n, int count){
		if(count == m){
			double s = 0;
			for(int i = 0; i < m; i++){
				for(int j = i+1; j < m; j++){
					s += nums[t[i]][t[j]];
				}
			}
			if(s > sum) sum = s;
		}
		else{
			for(int i = k; i < n; i++){
				t[count] = i;
				maxcal(i+1, t, m,n,  count+1);
			}
		}
	}
	public ArrayList<Double> mergeSort(ArrayList<Double> list){
		if(list.size() > 1){
			int n = list.size() / 2;
			int m = list.size() - n;
			ArrayList<Double> a1 = new ArrayList<Double>();
			ArrayList<Double> a2 = new ArrayList<Double>();
			for(int i = 0; i < n; i++) a1.add(list.get(i));
			for(int j = 0; j < m; j++) a2.add(list.get(j + n));
			a1 = mergeSort(a1);
			a2 = mergeSort(a2);
			return merge(a1, a2);
		}
		else return list;
	}

	
	public ArrayList<Double> merge(ArrayList<Double> a1, ArrayList<Double> a2){
		int i = 0;
		int j = 0;
		ArrayList<Double> a = new ArrayList<Double>();	
		while(i < a1.size() || j < a2.size()){
			if(j >= a2.size() || (i < a1.size() && a1.get(i) < a2.get(j))){
				a.add(a1.get(i));
				i++;
			}
			else{
				a.add(a2.get(j));
				j++;
			}
		}
		return a;
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}