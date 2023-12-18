import java.util.*;

public class Main {
	int[] a;
	int sum;
	
	boolean check(){
		for(int i=0;;i++){
			if(a[i]==0)	break;
			if(a[i]!=i+1) return false;
		}
		return true;
	}
	
	void sort(){
		for(int i=0;;i++){
			if(a[i]==0){
				a[sum]=i;
				break;
			}
			a[i]--;
		}
		
		for(int i=0;i<=sum;i++){
			if(a[i]==0){
				for(int j=i+1;j<=sum;j++){
					if(a[j]!=0){
						a[i] = a[j];
						a[j] = 0;
						break;
					}
					if(j==sum) i = sum+1;
				}
			}	
		}
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			sum = 0;
			int[] temp = new int[n];
			for(int i=0;i<n;i++){
				temp[i] = sc.nextInt();
				sum += temp[i];
			}
			a = new int[sum+1];
			boolean flag = true;
			int tri = 0;
			for(int i=1;;i++){
				tri += i;
				if(sum==tri) break;
				if(sum<tri){
					flag = false;
					break;
				}
			}
			if(flag==false){
				System.out.println("-1");
			}else{
				for(int i=0;i<n;i++) a[i] = temp[i];
				flag = false;
				for(int i=0;i<10000;i++){
					if(check()==true){
						System.out.println(i);
						flag = true;
						break;
					}else{
						sort();
					}
				}
				if(flag==false) System.out.println("-1");
			}
		}
	}

	
	public static void main(String[] args) {
		new Main().solve();
	}	
}