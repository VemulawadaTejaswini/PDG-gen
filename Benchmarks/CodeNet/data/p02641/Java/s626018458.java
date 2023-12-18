import java.util.Scanner;
     
public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
	ans = 101;
	int x = sc.nextInt();
	int n = sc.nextInt();
	int[] p = new int[n];
	for(int i=0;i<n;i++){
	    p[i] = sc.nextInt();
	}
	for(int i=0;i<101;i++){
	    boolean flag = false;
	    for(int j=0;j<n;j++){
		if(j==p[i]) flag = true;
	    }
	    if(!(flag) && Math.abs(x,i)<Math.abs(x,ans)){
		ans = i;
	    }
	}
	System.out.println(ans);
    }
    
}
