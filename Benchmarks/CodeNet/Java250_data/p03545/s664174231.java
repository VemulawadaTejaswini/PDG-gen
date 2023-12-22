import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        String a=sc.next();
		String[] b1=a.split("");
  		int[] a1=new int[4];
		for(int c=0;c<4;c++){
    		a1[c]=Integer.parseInt(b1[c]);
    	}
  	
  	String[] n=new String[4];
    for(int bit=0;bit<(1<<3);bit++){
      int ans=a1[0];
    	for(int g=0;g<3;g++){
        if((1&bit>>g)==1){
         ans+=a1[g+1];
         n[g+1]="+";
        }else{
        ans-=a1[g+1];
        n[g+1]="-";
        }
        }
      if(ans==7){
      break;
      }
    }
 	 String sans="";
   for(int e=0;e<4;e++){
    if(n[e]!=null){
   sans+=n[e];
    }
     sans+=b1[e];
   }
	sans+="=7";
    	System.out.println(sans);
    }
}
