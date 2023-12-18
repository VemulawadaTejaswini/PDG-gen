import java.util.*;

public class Main{
    static int[][] field;
    static int[] x,y;
    static int arrange;
    static int setX,setY;

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	x = new int[4];
	y = new int[4];

	x[0] = sc.nextInt();

	while(x[0]<5){
	    field = new int[8][8];
	    arrange = 0;
	    int count = 0;

	    y[0] = sc.nextInt();
	    for(int i=1; i<4; i++){
		x[i] = sc.nextInt();
		y[i] = sc.nextInt();
	    }

	    solve(count);

	    System.out.println(arrange);

	    x[0] = sc.nextInt();
	}
    }

    public static void solve(int count){
	if(count==8){arrange++; return;}

	for(int i=0; i<4; i++){
	    set();
	    if(setX!=-1){
		int xx = setX;
		int yy = setY;
		if(setPair(i,xx,yy)){
		    field[yy+y[i]][xx+x[i]] = 1;
		    solve(count+1);
		    field[yy+y[i]][xx+x[i]] = 0;
		}
		field[yy][xx] = 0;
	    }
	}
    }

    public static void set(){
	for(int i=0; i<4; i++){
	    for(int j=0 ;j<4; j++){
		if(field[i][j]==0){
		    field[i][j] = 1;
		    setX = j;
		    setY = i;
		    return;
		}
	    }
	}
	setX = -1;
    }

    public static boolean setPair(int num, int xx, int yy){
	if(yy+y[num]<0 || xx+x[num]<0 || yy+y[num]>3 || xx+x[num]>3){return false;}
	if(field[yy+y[num]][xx+x[num]]==0){return true;}
	return false;
    }
}