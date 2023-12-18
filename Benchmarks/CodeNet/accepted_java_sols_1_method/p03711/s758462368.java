import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int[] g1 = {1,3,5,7,8,10,12};
	int[] g2 = {4,6,9,11};
	int[] g3 = {2};

	int x = scan.nextInt();
	int y = scan.nextInt();

	int xg = 0;
	int yg = 0;
	for(int i = 0; i < g1.length; i++){
	    if(g1[i] == x){
		xg = 1;
	    }
	    if(g1[i] == y){
		yg = 1;
	    }
	}
	for(int i = 0; i < g2.length; i++){
	    if(g2[i] == x){
		xg = 2;
	    }
	    if(g2[i] == y){
		yg = 2;
	    }
	}
	for(int i = 0; i < g3.length; i++){
	    if(g3[i] == x){
		xg = 3;
	    }
	    if(g3[i] == y){
		yg = 3;
	    }
	}

	if(xg == yg){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}
