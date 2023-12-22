import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
  		int e=1;
  		int b=0;

  		int[] a=new int[n];
		for(int c=0;c<n;c++){
    		a[c]=sc.nextInt();
           if(a[c]==e){
            b++;
           	e++;
           }
    	}
     int ans=n-b;
  		if(b==0){
        	ans=-1;
        }

    	System.out.println(ans);
    }
}

