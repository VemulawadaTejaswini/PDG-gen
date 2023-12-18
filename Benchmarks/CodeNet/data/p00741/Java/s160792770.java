import java.util.Scanner;
import java.util.*;
import java.lang.Character.*;

public class Main {
    static int map [][];
    static boolean memo[][];
    static boolean tmpmemo[][];
    static int w;
    static int h;
    static int islandcount;
    static boolean isnewland(int i, int j){
	return (map[i][j] == 1) && (memo[i][j] == false);
    }
    static void visitaround(int i, int j){
	if(i<0 || w<=i){
	    return;
	}
	if(j<0 || h<=j){
	    return;
	}
	if(map[i][j] == 0){
	    return;
	}
	if(tmpmemo[i][j] == true){
	    return;
	}

	if(isnewland(i, j)){
	    memo[i][j] = true;
	    tmpmemo[i][j] = true;
	}

	visitaround(i+1, j + 1);
	visitaround(i, j + 1);
	visitaround(i - 1, j + 1);
	visitaround(i + 1, j);
	visitaround(i - 1, j);
	visitaround(i + 1, j - 1);
	visitaround(i, j - 1);
	visitaround(i - 1, j - 1);
    }
    public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	for(;;){
	    h = sc.nextInt();
	    w = sc.nextInt();
	    if(w == 0 && h == 0){
		break;	    }
	    map = new int[w][h];
	    memo = new boolean[w][h];
	    islandcount = 0;
	    for(int i=0; i<w;++i){
		for(int j=0; j<h;++j){
		    map[i][j] = sc.nextInt();
		}
	    }

	    for(int i=0; i<w;++i){
		for(int j=0; j<h;++j){
		    if(isnewland(i, j)){
			tmpmemo = new boolean[w][h];
			islandcount++;
			visitaround(i, j);
			
		    }
		}
	    }
	    System.out.println(islandcount);
	    
	}
    }
}