import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
		int c=sc.nextInt();
		int max=Math.max(Math.max(a,b),c);
  		int sa=max*3-a-b-c;
  		if(sa%2!=0){
        sa=sa+3;
        }
          
  		
    	System.out.println(sa/2);
    }
}
