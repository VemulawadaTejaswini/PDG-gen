import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
		int c=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
  		int d=Math.max(x,y);
        int k=Math.min(x,y);
  		long min=(long)Math.pow(10,18);
        long kei=0;
		for(int e=0;e<=d;e++){
            if(k-e<0){
              if(k==y){
               kei=a*(x-e)+c*2*e;
              }else{
               kei=b*(y-e)+c*2*e;
              }
            }else{
    		kei=a*(x-e)+b*(y-e)+c*2*e;
            }
          min=Math.min(min,kei);
    	}
   

    	System.out.println(min);
    }
}
