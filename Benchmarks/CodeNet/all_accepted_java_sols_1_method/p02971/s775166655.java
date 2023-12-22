import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

  		int[] a=new int[n];
		for(int c=0;c<n;c++){
    		a[c]=sc.nextInt();
    	}
  		int[] b=a.clone();
  		Arrays.sort(b);
  		int max1=b[n-1];
  		int max2=b[n-2];
  		
  		
    for(int e=0;e<n;e++){
 	if(a[e]==max1){
    		System.out.println(max2);
    	}else{
     		System.out.println(max1);
   	 }
    }
    }
}

