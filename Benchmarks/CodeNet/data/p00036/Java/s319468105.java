import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	String[] type = {"A","B","C","D","E","F","G"};
	while(sc.hasNext()){
	    int[][] field = new int[8][8];
	    
	    for(int i=0; i<8; i++){
		String line = sc.next();
		for(int j=0; j<8; j++){
		    field[i][j] = Integer.parseInt(line.substring(j,j+1));
		}
	    }
	    
	    int[] x = new int[4];
	    int[] y = new int[4];
	    int count = 0;
	    for(int i=0; i<8; i++){
		if(count>=4){break;}
		for(int j=0; j<8; j++){
		    if(count>=4){break;}
		    if(field[i][j]==1){
			x[count] = j;
			y[count] = i;
			count++;
		    }
		}
	    }
	    
	    System.out.println(getType(x,y));
	}
    }

    public static String getType(int[] x, int[] y){
	if(x[0]==x[1]&&x[0]==x[2]&&x[0]==x[3]){return  "B";}
	if(y[0]==y[1]&&y[0]==y[2]&&y[0]==y[3]){return  "C";}
	if(x[0]==x[2]&&x[1]==x[3]&&y[0]==y[1]&&y[2]==y[3]){return "A";}
	if(x[0]==x[2]&&x[1]==x[3]&&y[1]==y[2]){return "D";}
	if(x[0]==x[1]&&x[2]==x[3]&&y[1]==y[2]){return "F";}
	if(x[1]==x[2]&&y[0]==y[1]&&y[2]==y[3]){return "E";}
	return "G";
    }
}