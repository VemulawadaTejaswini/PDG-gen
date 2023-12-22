import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      	long ans=0;

  		char[][] ch=new char[n][10];
  		String[] s=new String[n];
		for(int c=0;c<n;c++){
    		ch[c]=sc.next().toCharArray();
          	Arrays.sort(ch[c]);
          	s[c]=String.valueOf(ch[c]);	
    	}
  		Arrays.sort(s);
  		long count=0;
  		int d=0;
  		while(d<n){
    	for(int e=d+1;e<n;e++){
 		if(s[d].equals(s[e])){
    		count++;
    	}else{
     		break;
   		 }
        }
           ans+=count*(count+1)/2;
           d+=count+1;
           count=0;
        }
    	System.out.println(ans);
    }
}