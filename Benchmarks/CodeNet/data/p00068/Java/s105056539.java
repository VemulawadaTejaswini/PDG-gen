import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			double[][] xy = new double[n][2];
			for(int i=0;i<n;i++){
				String[] s = sc.next().split(",");
				xy[i][0] = Double.valueOf(s[0]);
				xy[i][1] = Double.valueOf(s[1]);
			}
			
			Arrays.sort(xy, new Comparator<double[]>(){
				public int compare(double[] o1, double[] o2) {
					if(o1[0]==o2[0]){
						if(o1[1]-o2[1]>0) return 1;
						else return -1;
					}else{
						if(o1[0]-o2[0]>0) return 1;
						else return -1;
					}
				}
			});
			
			int z = 0;
			int zz = 0;
			int cnt = 0;
			
			double a = Double.MAX_VALUE;
			double b, c;
			boolean flag;
			while(true){
				flag = false;
				b = -Double.MAX_VALUE;
				for(int i=z+1;i<n;i++){
					if(xy[z][0]==xy[i][0]) c = Double.MAX_VALUE;
					else c = (xy[z][1]-xy[i][1])/(xy[z][0]-xy[i][0]);
					
					if(b<c && c<=a){
						b = c;
						zz = i;
						flag = true;
					}
				}
				a = b;
				z = zz;
				cnt++;
				if(flag==false) break;
			}
			
			a = Double.MAX_VALUE;
			while(true){
				flag = false;
				b = -Double.MAX_VALUE;
				for(int i=z-1;i>=0;i--){
					if(xy[z][0]==xy[i][0]) c = Double.MAX_VALUE;
					else c = (xy[z][1]-xy[i][1])/(xy[z][0]-xy[i][0]);
					
					if(b<c && c<=a){
						b = c;
						zz = i;
						flag = true;
					}
				}
				a = b;
				z = zz;
				cnt++;
				if(flag == false) break;
			}
			
			System.out.println(n-cnt+2);
		}	
	}	
}