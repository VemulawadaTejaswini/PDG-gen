import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
  		int[] x=new int[n];
		for(int c=0;c<n;c++){
    		x[c]=sc.nextInt();
    	}
    	Arrays.sort(x);
        int ch=0;
  		int min=100000000;
  		int kari=0;
    
 	for(int b=x[0];b<=100;b++){
    	for(int e=0;e<n;e++){
         kari+=(x[e]-b)*(x[e]-b);
        }
        if(kari<min){
          min=kari;
        }else{
        	break;
        }
       kari=0;
    }
  	
 

    	System.out.println(min);
    }
}
