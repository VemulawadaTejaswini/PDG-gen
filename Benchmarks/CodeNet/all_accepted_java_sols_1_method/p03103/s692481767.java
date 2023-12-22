import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long m=sc.nextLong();
		long ans=0;

  		long[][] ab=new long[n][2];
		for(int c=0;c<n;c++){
    		ab[c][0]=sc.nextLong();
          	ab[c][1]=sc.nextLong();
    	}
  
        Arrays.sort(ab,(a, b) -> Long.compare(a[0], b[0]));
        long count=0;
        int c=0;
 		while(count<m){
        if(ab[c][1]>0){
        ans+=ab[c][0];
        ab[c][1]--;
        }else{
        ans+=ab[c+1][0];
        ab[c+1][1]--;
        c++;
        }
        count++;
        }

    	System.out.println(ans);
    }
}