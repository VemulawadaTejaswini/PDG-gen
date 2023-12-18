import java.util.Scanner;
class Main{
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int ans,n;
    while(sc.hasNext()){
    	n=sc.nextInt();
    	ans=0;
    	for(int i=2;i<=n;i++){
    		int flag=0;
    		for(int j=1;j<i;j++){
    			if(i%j==0)flag++;
    		}
    		if(flag<2)ans++;
    	}
    	System.out.println(ans);
    }
    }
}