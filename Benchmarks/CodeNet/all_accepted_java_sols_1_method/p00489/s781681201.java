import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] point=new int[n];
		for(int i=0;i<n*(n-1)/2;i++){
			int s=sc.nextInt()-1,t=sc.nextInt()-1,sp=sc.nextInt(),tp=sc.nextInt();
			if(sp>tp)point[s]+=3;
			else if(tp>sp)point[t]+=3;
			else{
				point[s]++;
				point[t]++;
			}
		}
		int[] team=new int[n];
		for(int i=0;i<n;i++)team[i]=point[i];
		for(int i=0;i<point.length-1;i++){
            for(int j=0;j<point.length-i-1;j++){
            	if(point[j]<point[j+1]){
            		int a=point[j];
            		point[j]=point[j+1];
            		point[j+1]=a;
            	}
            }
        }
		int[] rnk=new int[n];
		int t=1;
		rnk[0]=1;
		for(int i=1;i<n;i++){	
			if(point[i]!=point[i-1])t=i+1;
			rnk[i]=t;			
		}
		int no=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(team[i]==point[j])no=rnk[j];
			}
			System.out.println(no);
		}
	}
}