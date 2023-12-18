import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    if(n!=0){
		solve(n);
	    }
	}
    }

    static void solve(int n){
	int maxX=0, minX=0, maxY=0, minY=0;
	int i=0;
	int[][] box = new int[n][2];
	i++;

	for(; i<n; i++){
	    int num = kbd.nextInt();
	    int d = kbd.nextInt();
	    setBox(num, d, box, i);
	}

	for(i=0; i<n; i++){
	    if(box[i][0]>maxX) maxX=box[i][0];
	    if(box[i][0]<minX) minX=box[i][0];
	    if(box[i][1]>maxY) maxY=box[i][1];
	    if(box[i][1]<minY) minY=box[i][1];
	}

	System.out.println((maxX-minX+1)+" "+(maxY-minY+1));
    }

    static void setBox(int num, int d, int[][] box, int i){
	int x = box[num][0];
	int y = box[num][1];

	if(d==0){ x--; }
	else if(d==1){ y--; }
	else if(d==2){ x++; }
	else if(d==3){ y++; }

	box[i][0] = x;
	box[i][1] = y;
    }
}