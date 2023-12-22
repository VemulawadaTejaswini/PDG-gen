import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
		
		int[] l=new int[m];
  		int[] r=new int[m];
		for(int c=0;c<m;c++){
    		l[c]=sc.nextInt();
          	r[c]=sc.nextInt();
    	}
  		int max=r[0];
  		int min=l[0];
    for(int a=0;a<m-1;a++){
 	if(max<l[a+1]){
      		max=-1; 
      		min=0;
    		break;
    	}else if(r[a+1]<min){
      		max=-1;
      		min=0;
     		break;
   	 }
      max=Math.min(r[a+1],max);
      min=Math.max(l[a+1],min);
    }

    	System.out.println(max-min+1);
    }
}
