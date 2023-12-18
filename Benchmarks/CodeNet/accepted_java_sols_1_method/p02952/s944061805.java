import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
  		int ans=0;
   
		for(int c=1;c<=n;c++){
        	if(String.valueOf(c).length()%2==1){
              ans++;
        }
        }
    	System.out.println(ans);
    }
}