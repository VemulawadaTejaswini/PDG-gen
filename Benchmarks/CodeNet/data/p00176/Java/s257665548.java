import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    String[] name = { "black", "blue", "lime", "aqua",
		      "red", "fuchsia", "yellow", "white" };
    int[][] color = { {0, 0, 0}, {0, 0, 255}, {0, 255, 0}, {0, 255, 255},
		  {255, 0, 0}, {255, 0, 255}, {255, 255, 0}, {255, 255, 255} };
    int[] dk;
    String n;
    int[] c;
    int min, minN;

    void run(){
	while(sc.hasNext()){
	    n = sc.next();
	    if(n.equals("0")) break;
	    c = new int[3];
	    dk = new int[8];
	    set(n.substring(1, 3), n.substring(3, 5), n.substring(5, 7));

	    for(int i=0; i<dk.length; i++)
		dk[i] = getD(i);

	    min = Integer.MAX_VALUE;
	    minN = 0;
	    for(int i=0; i<dk.length; i++)
		if(min > dk[i]){
		    min = dk[i];
		    minN = i;
		}

	    System.out.println(name[minN]);
	}
    }

    void set(String r, String g, String b){
	c[0] = Integer.parseInt(r, 16);
	c[1] = Integer.parseInt(g, 16);
	c[2] = Integer.parseInt(b, 16);
    }

    int getD(int i){
	int re=0;
	for(int k=0; k<c.length; k++)
	    re += (c[k]-color[i][k])*(c[k]-color[i][k]);
	return re;
    }
}