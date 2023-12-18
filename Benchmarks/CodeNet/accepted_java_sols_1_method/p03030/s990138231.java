import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		String[] s=new String[n];
  		
		for(int c=0;c<n;c++){
          	s[c]=sc.next()+"_"+(1100-sc.nextInt())+"_"+(c+1);
          	
    	}
        Arrays.sort(s);
  		for(String s1:s){
		String ans=s1.split("_")[2];
    	System.out.println(ans);
        }
    }
}