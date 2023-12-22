import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
  		char[] c=s.toCharArray();
  		

   for(int d=0;d<s.length();d++){
 		c[d]= (char)((c[d]-'A'+n)%26+'A');
     }
           
    	String ans="";
    	System.out.println(ans.valueOf(c));
    }
}