import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	int n = kbd.nextInt();
	while(n>0){
	    solve();
	    n--;
	}
    }

    static void solve(){
	int[] a = new int[4];
	int[] b = new int[4];
	int i;
	for(i=0; i<4; i++){
	    a[i] = kbd.nextInt();
	}	
	for(i=0; i<4; i++){
	    b[i] = kbd.nextInt();
	}

	int[] ans = new int[4];

	ans[0] = a[0]*b[0] - a[1]*b[1] - a[2]*b[2] - a[3]*b[3];
	ans[1] = a[0]*b[1] + a[1]*b[0] + a[2]*b[3] - a[3]*b[2];
	ans[2] = a[0]*b[2] - a[1]*b[3] + a[2]*b[0] + a[3]*b[1];
	ans[3] = a[0]*b[3] + a[1]*b[2] - a[2]*b[1] + a[3]*b[0];

	System.out.println(ans[0]+" "+ans[1]+" "+ans[2]+" "+ans[3]);
    }
}