import java.util.*;
public class Main {
	public static int n;
	public static int s;
	public static int [] num ={0,1,2,3,4,5,6,7,8,9};
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()){
        n=scan.nextInt();
        s=scan.nextInt();
        if((n|s)==0)break;
        System.out.println(conv(0,0,0));
        }
      

  }
    public static int conv(int k,int i,int sum){
    	//System.out.println(k+" "+i+" "+sum);
    	
    	if(sum > s)return 0;
    	if(k==n){
    		if(s ==sum)return 1;
    	}
    	if(i>9)return 0;
    	return conv(k,i+1,sum)+conv(k+1,i+1,sum+num[i]);
    }
  }