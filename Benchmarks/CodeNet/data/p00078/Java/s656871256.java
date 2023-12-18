&#65279;import java.util.Scanner;

public class Main {
    
    static int cnt;
    static int x, y;
    static int[][] a;
    static int n;
    
    static void pushNumber(){
	// 2. 次の数字を右斜め下のマス目に...
	x++;
	y++;

	/* 2-1. 右にはみ出した場合には、同じ行の左はしに、
	 * 左にはみ出した場合には、同じ行の右はしに、
	 * 下にはみ出した場合には、同じ列の一番上に... */
	if(x>=n){
	    x=0;
	}
	if(y>=n){
	    y=0;
	}
	if(x<0){
	    x=n-1;
	}
	if(y<0){
	    y=n-1;
	}
	if(a[x][y]==0){
	    a[x][y]=cnt++;  // 数字を入れる
	}
	else{
	    /* 数字をいれようとしたマス目が埋まっているときには、
	     * その埋まっているマス目の左斜め下のマス目に*/
	    y-=2;
	}
    }
    
    public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);

	while(true){
	    n = stdIn.nextInt();  // Input
	    if(n==0){		  // Finish
		return;
	    }
	    a = new int[n][n];    // Box Make

	    // 1. 中央のマス目のちょうど一つ下のマス目に１をいれる。
	    x=(n-1)/2;
	    y=x++;
	    a[x][y]=1;

	    cnt = 2;
	    while(true){
		if(cnt>n*n){
		    break;
		}
		pushNumber();
	    }

	    // Output
	    for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
		    System.out.printf("%4d",a[i][j]);
		}
		System.out.println();
	    }
	}
    }
}