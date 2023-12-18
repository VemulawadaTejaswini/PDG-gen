import java.util.*;
import java.math.*;
class Main{
    int w,h;
    char[][] map;
    String[][] dp;
    void run(){
	Scanner sc= new Scanner(System.in);
	while(true){
	    w=sc.nextInt();
	    h=sc.nextInt();
	    if((w|h)==0)break;
	    map=new char[h+1][w+1];
	    dp=new String[h+1][w+1];	   
	    
	    for(int i=0;i<h+1;i++){
		Arrays.fill(dp[i],"");
	    }
	    BigInteger max=new BigInteger("0");
	    for(int i=0;i<h;i++){
		map[i]=(sc.next()+"A").toCharArray();
	    }
	    for(int i=h-1;i>=0;i--){
		for(int j=w-1;j>=0;j--){
		    if(Character.isDigit(map[i][j])){
			dp[i][j]=(map[i][j]+compare(dp[i+1][j],dp[i][j+1]));
			BigInteger temp=new BigInteger(dp[i][j]);
			if(temp.compareTo(max)>0)max=temp;
		    }
		}
	    }
	    
	    System.out.println(max);
	}
    }
    String compare(String a,String b){
	if(a.length()>b.length())return a;
	else if(a.length()<b.length())return b;
	else {
	    if(a.compareTo(b)>0)return a;
	    else return b;
	}
    }
    public static void main(String[] args){
	new Main().run();
    }
}