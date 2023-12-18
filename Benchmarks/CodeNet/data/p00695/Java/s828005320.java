import java.util.*;

class Main{
    static int[][] field;
    static int max;

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	
	while(n!=0){
	    field = new int[5][5];
	    for(int i=0; i<5; i++){
		for(int j=0; j<5; j++){
		    field[i][j] = sc.nextInt();
		}
	    }
	    max = 0;
	    
	    solve();

	    System.out.println(max);
	    
	    n--;
	}
    }
    
    public static void solve(){
	for(int i=0; i<5; i++){
	    for(int j=0; j<5; j++){
		if(field[i][j]==1){
		    int xLen = getXLength(i,j);
		    int yLen = getYLength(i,j);
		    int len = getRectangle(i,j,xLen,yLen);
		    
		    if(len>max)max = len;
		}
	    }
	}
    }

    public static int getXLength(int i, int j){
	int len = 1;
	//if(j+1>=5){return len;}
	while(j+1<5 && field[i][++j]!=0){len++;}
	//System.out.println(len);
	return len;
    }

    public static int getYLength(int i, int j){
	int len = 1;
	//if(i+1>=5){return len;}
	while(i+1<5 && field[++i][j]!=0){len++;}
	return len;
    }

    public static int getRectangle(int y, int x, int xLen, int yLen){
	int count = 1;
	int maxLen = 0;
	if(xLen>=yLen){maxLen = xLen;}
	else{maxLen = yLen;}
	for(int i=y+1; i<=y+yLen-1; i++){
	    for(int j=x+1; j<=x+xLen-1; j++){
		if(field[i][j]==1){
		    if(maxLen<((i-y+1)*(j-x+1))){
			maxLen = (i-y+1)*(j-x+1);
			//System.out.println((j-x+1)+" "+(i-y+1)+" "+maxLen);
		    }
		}else {xLen=j-x; j=x+xLen-1;}
	    }
	}

	//System.out.println("x:"+x+" y:"+y+" maxLen:"+maxLen);
	return maxLen;
    }
}