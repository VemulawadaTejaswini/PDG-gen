import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int[][] field = new int[10][10];

	while(sc.hasNext()){

	    String[] line = sc.next().split(",");
	    int x = Integer.parseInt(line[0]);
	    int y = Integer.parseInt(line[1]);
	    int size = Integer.parseInt(line[2]);

	    //·×ÄÌH
	    field[y][x]++;
	    if(x-1>=0){field[y][x-1]++;}
	    if(x+1<10){field[y][x+1]++;}
	    if(y-1>=0){field[y-1][x]++;}
	    if(y+2<10){field[y+1][x]++;}

	    //ÈãÌH
	    if(size>=2){
		if(x-1>=0 && y-1>=0){field[y-1][x-1]++;}
		if(x-1>=0 && y+1<10){field[y+1][x-1]++;}
		if(x+1<10 && y-1>=0){field[y-1][x+1]++;}
		if(x+1<10 && y+1<10){field[y+1][x+1]++;}
	    }

	    //åÌH
	    if(size==3){
		if(x-2>=0){field[y][x-2]++;}
		if(x+2<10){field[y][x+2]++;}
		if(y-2>=0){field[y-2][x]++;}
		if(y+2<10){field[y+2][x]++;}
	    }
	}
	
	int count = 0;//FÌÂ¢Ä¢È¢ªÌ}XÚ
	int max = 0;//1ÔZ¢}XÚÌZ³
	for(int i=0; i<10; i++){
	    for(int j=0; j<10; j++){
		if(field[i][j]==0){count++;}
		if(field[i][j]>max){max = field[i][j];}
	    }
	}
	System.out.println(count);
	System.out.println(max);
    }
}