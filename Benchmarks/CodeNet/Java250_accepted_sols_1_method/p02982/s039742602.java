import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();

  		int[][] a=new int[n][d];
		for(int c=0;c<n;c++){
          for(int e=0;e<d;e++){
    		a[c][e]=sc.nextInt();
          }
    	}
  		int ans=0;
  		int c=0;
  		for(int f=0;f<n-1;f++){
          for(int e=f+1;e<n;e++){
          for(int g=0;g<d;g++){
          	c+=Math.pow((a[f][g]-a[e][g]),2);
          }
          
        	if(Math.sqrt(c)==(int)Math.sqrt(c)){
              ans++;
            }
           c=0;
          }
        }
    

    	System.out.println(ans);
    }
}

