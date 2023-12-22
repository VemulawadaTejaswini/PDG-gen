import java.util.*; 
 
class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
       int n = Integer.parseInt(sc.next());
       
  		int[] a=new int[n];
		for(int c=0;c<n;c++){
    		a[c]=Integer.parseInt(sc.next());
    	}
  Map<Integer, Long> map1 = new HashMap<Integer, Long>();
  		int[] b=a.clone(); 
  		Arrays.sort(b);
  		long f=0;
  		long[] ans=new long[n];
  		long count=0;
  		
  		for(int c=1;c<b.length;c++){
        	if(b[c-1]==b[c]){
            	count++;
            }else{
              count++;
              map1.put(b[c-1],count);
              f+=count*(count-1)/2;
              count=0;
              }
        
        }
          count++;
         map1.put(b[b.length-1],count);
  		f+=count*(count-1)/2;
  
  		for(int d=0;d<b.length;d++){
          long s=map1.get(a[d]);
          ans[d]=f-s*(s-1)/2;
          ans[d]+=(s-1)*(s-2)/2;
        }
  
  	for(long e:ans){
    	System.out.println(e);
    }      
  		
   
    
}
}
