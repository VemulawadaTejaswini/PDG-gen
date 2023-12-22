import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;

  		String[] s=new String[n];
		for(int c=0;c<n;c++){
    		s[c]=sc.next();
    	}
		Arrays.sort(s); 
  		if(n==1){
        ans=1;
        }else{
  		for(int d=0;d<n-1;d++){
        if(!s[d].equals(s[d+1])){
        ans++;
        }
        }
          ans++;
        }

    	System.out.println(ans);
    }
}