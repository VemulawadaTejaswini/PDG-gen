import java.util.*;
public class Main {
	public static int [] coin ={500,100,50,10,5,1};
	public static int [] n = new int[6];
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        while(true){
       int p= scan.nextInt();
       if(p==0)break;
     for(int i=5;i>=0;i--)n[i] = scan.nextInt();

     int ans=1000000;
  for(int i=p;i<p+1000;i++)
	 ans =Math.min(ans,buy(i)+change(i-p));
	  System.out.println(ans);
        }
    }
  public static int change(int n){
	  int sum=0;
	  for(int i=0;i<6;i++){
		  if(n>=coin[i]){
		 sum+= n/coin[i];
		 n%=coin[i];
		  }
	  }
	  return sum;

  }

  public static int buy(int c){
	  int sum=0;
	  for(int i=0;i<6;i++){
		  if(c>=coin[i]){
			  int tmp=Math.min(c/coin[i],n[i]);
			  sum+=tmp;
			  c-=coin[i]*tmp;
		  }
	  }if(c!=0)sum=1000000;
	  return sum;
  }
  }