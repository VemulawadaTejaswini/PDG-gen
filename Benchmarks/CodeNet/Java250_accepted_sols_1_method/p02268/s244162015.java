import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		// TODO ?????????????????????????????????????????????
		int n,q,i,j,ans=0,left,right,mid,key;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int s[]=new int[n];
		for(i=0;i<n;i++){
			s[i]=sc.nextInt();
		}
		q=sc.nextInt();
		int t[]=new int[q];
		for(j=0;j<q;j++){
			t[j]=sc.nextInt();
		}

		for(j=0;j<q;j++){
			key=t[j];
			left=0;
		    right=n;
		    while(left<right){
		    	mid=(left+right)/2;

			    if(s[mid]==key){
			    	left=right+1;
			        ans++;
			    }else if(key<s[mid]){
			    	right=mid;
			    }else{
			    	left=mid+1;
			    }
			}


		}
		System.out.println(ans);



	}

}