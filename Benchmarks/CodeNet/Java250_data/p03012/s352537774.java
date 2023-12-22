import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

  		int[] w=new int[n];
  		int s2=0;
		for(int c=0;c<n;c++){
    		w[c]=sc.nextInt();
          	s2+=w[c];
    	}
  		int s1=0;
  		int min=s2-s1;
  		
  
  		for(int a=0;a<n-1;a++){
        	s1+=w[a];
            s2-=w[a];
           if(Math.abs(s2-s1)<=min){
           	min=Math.abs(s2-s1);
           }else{
           	break;
           }
        
        }

    	System.out.println(min);
    }
}