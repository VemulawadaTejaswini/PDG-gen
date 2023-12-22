import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
	String s=sc.next();
  		int c=0;

   for(int b=0;b<n-2;b++){
 	if(s.substring(b,b+1).equals("A")&&s.substring(b+1,b+2).equals("B")&&s.substring(b+2,b+3).equals("C")){
    		c++;
   	 }

        }
    	System.out.println(c);
    }
}