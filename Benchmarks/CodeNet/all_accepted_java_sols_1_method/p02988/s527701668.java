import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

  		int[] p=new int[n];
		for(int c=0;c<n;c++){
    		p[c]=sc.nextInt();
    	}
  		int ans=0;
    	for(int d=0;d<n-2;d++){
        	if(p[d]<p[d+1]&&p[d+1]<p[d+2]){
            	ans++;
            }else if(p[d+2]<p[d+1]&&p[d+1]<p[d]){
            	ans++;
            }
        }

    	System.out.println(ans);
    }
}