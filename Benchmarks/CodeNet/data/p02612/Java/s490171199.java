import java.util.*; 
 
class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n%1000;
        if(a==0){
        ans=0;
        }else{
  		int ans=1000-a;
        }
  		
 
    	System.out.println(ans);
    }
}