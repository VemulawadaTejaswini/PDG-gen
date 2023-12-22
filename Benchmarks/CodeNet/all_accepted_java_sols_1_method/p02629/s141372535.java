import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        String ans="";
  		int c=0;
		String s="abcdefghijklmnopqrstuvwxyz";
  		String[] a=s.split("");
       
  
  		while(n>0){
         long b1=n/(long)Math.pow(26,c);
         long b2=b1%26;
            if(b2==0){
            b2=26;
            }
         ans=a[(int)b2-1]+ans;
         n=n-(long)Math.pow(26,c)*b2;
         c++;
           
        }
		

    	System.out.println(ans);
    }
}