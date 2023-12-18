import java.util.*;
class Main{
    Scanner sc=new Scanner(System.in);
    void main(){
	while(true){
	    int n=sc.nextInt();
	    int x=sc.nextInt();
	    if(n==0&&x==0)break;
	    int ans=0;
	    for(int i=1;i<=n;i++){
		for(int j=i;j<=n;j++){
		    if(j!=i){
			for(int k=j;k<=n;k++){
			    if(k!=i&&k!=j){
				if(k+j+i==x)ans++;
			    }
			}
		    }
		}
	    }
	    System.out.println(ans);
	}
    }
    public static void main(String[]ag){
	new Main().main();
    }
}