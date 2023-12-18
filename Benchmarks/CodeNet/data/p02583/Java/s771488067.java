import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int[] l = new int[n];
		Arrays.setAll(l, i -> Integer.parseInt(sc.next()));
		int count = 0;
		for(int i=0; i<n-2; i++){
			jloop: for(int j=1; j<n-1; j++){
				if(i >= j){
					continue jloop;
				}
				kloop: for(int k=2; k<n; k++){
					if(i >= k || j >= k){
						continue kloop;
					}
					if(l[i] != l[j] && l[j] != l[k] && l[k] != l[i] && l[i]+l[j] > l[k] && l[j]+l[k] > l[i] && l[k]+l[i] > l[j]){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
