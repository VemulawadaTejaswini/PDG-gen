import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
  		int[] v=new int[n];
		for(int c=0;c<n;c++){
    		v[c]=sc.nextInt();
    	}
  	Arrays.sort(v);
  	double ans=(double)v[0];
    
 	for(int d=1;d<n;d++){
      ans=(ans+v[d])/2;
    
    }

    	System.out.println(ans);
    }
}

