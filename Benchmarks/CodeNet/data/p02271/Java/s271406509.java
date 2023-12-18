import java.util.Scanner;
public class Main{
static int[] kazu;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int i,n;
       Scanner red = new Scanner(System.in);
       kazu= new int[red.nextInt()];
       for(i=0;i<kazu.length;i++){
    	   kazu[i]=red.nextInt();
       }
       n=red.nextInt();
      for(i=0;i<n;i++){
    	   if(solve(0,red.nextInt())){
    		   System.out.println("yes");
    	   }else{
    		   System.out.println("no");
    	   }
      }
	}
	public static boolean solve(int p,int t){
		if(t==0) return true;
		if(t<0||p==kazu.length) return false;
		return (solve(p+1,t-kazu[p])||solve(p+1,t));
	}

}

