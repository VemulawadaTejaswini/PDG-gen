import java.util.*;
import java.lang.Math;
class Main{
    void run(){
	Scanner sc=new Scanner(System.in);
	int q=sc.nextInt();
	for(int attend=0;attend<q;attend++){
	    int[][] map=new int[5+1][5+1];
	    for(int i=0;i<5;i++){
		for(int j=0;j<5;j++){
		    map[i][j]=sc.nextInt();
		}
	    }    
	    
	    int ans=0;
	    for(int i=0;i<5;i++){for(int j=0;j<5;j++){
		    int maxX=5;
		    for(int y=i;y<5;y++){
			for(int x=j;x<maxX;x++){
			    if(map[y][x]==0){
				maxX=x;
				break;
			    }
			    else{
				ans=Math.max(ans,(y-i+1)*(x-j+1));
			    }
			}
		    }
		}
	    }
	    System.out.println(ans);
	}
	
    }
    public static void main(String[] args){
	new Main().run();
    }
}