import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	static int n,m,sumt,sumh;
	static int[] taro,hanako;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		label:while(true){
			n=cin.nextInt();
			m=cin.nextInt();

			if(n+m==0)break;
			sumt=sumh=0;
			taro=new int[n];
			hanako=new int[m];
			for(int i=0;i<n;i++){
				taro[i]=cin.nextInt();
				sumt+=taro[i];
			}
			for(int i=0;i<m;i++){
				hanako[i]=cin.nextInt();
				sumh+=hanako[i];
			}
			List<int[]> list=new ArrayList<int[]>();
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					if(sumt-taro[i]+hanako[j]==sumh-hanako[j]+taro[i]){
//						System.out.println(taro[i]+" "+hanako[j]);
						list.add(new int[]{taro[i],hanako[j],taro[i]+hanako[j]});
//						continue label;
					}
				}
			}
			if(list.size()==0){
				System.out.println(-1);	
			}
			else{
				Collections.sort(list,new Comparator<int[]>(){
					public int compare(int[] a,int[] b){
						return a[2]-b[2];
					}
				});
				System.out.println(list.get(0)[0]+" "+list.get(0)[1]);
			}

			
		}

	}

}