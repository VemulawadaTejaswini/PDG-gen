//20200815B
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] L=new int[n];
		for(int i=0;i<n;i++){
			L[i]=sc.nextInt();
		}
		int ans=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				for(int k=j+1;k<n;k++){
					if((L[i]<L[j]+L[k])&& (L[k]<L[i]+L[j])&& (L[j]<L[k]+L[i])){
                      	ans++;
                      	if(L[i]==L[j]||L[j]==L[k]||L[k]==L[j]){
                        	ans--;
                        }
                   
                      	//System.out.println(i);
                      	//System.out.println(j);
                      	//System.out.println(k);
					}
				}
			}
		}
		System.out.println(ans);
	}
}