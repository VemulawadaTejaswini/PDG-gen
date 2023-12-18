import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			double[][] a = new double[n][2];
			final String[] t = new String[n];
			for(int i=0;i<n;i++){
				t[i] = sc.next();
				int p = sc.nextInt();
				int q = sc.nextInt() + sc.nextInt() + sc.nextInt();
				int r = sc.nextInt() + sc.nextInt();
				int f = sc.nextInt();
				int s = sc.nextInt();
				int m = sc.nextInt();
				
				a[i][0] = i;
				a[i][1] = (double)(f*m*s-p)/(m*r+q);
			}
			
			Arrays.sort(a, new Comparator<double[]>(){
				public int compare(double[] o1, double[] o2) {
					if(o1[1]==o2[1])return t[(int)o1[0]].compareTo(t[(int)o2[0]]);
					else if(o1[1]-o2[1]>0) return -1;
					else return 1;
				}
			});
			
			for(int i=0;i<n;i++) System.out.println(t[(int)a[i][0]]);
			System.out.println("#");
		}	
	}	
}