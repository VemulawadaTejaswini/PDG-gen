import java.util.*;

public class Main
{
    private static final int field_size = 8;
    private static final int chein_length = 2;

    private static final int[] xdir = {0, 1, 0, -1};
    private static final int[] ydir = {1, 0, -1, 0};

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.nextLine());

	for(int i = 1; i <= n; ++i){
	    String blank_line = sc.nextLine();

	    char[][] field = new char[field_size][];
	    for(int j = 0; j < field_size; ++j){
		field[j] = sc.nextLine().toCharArray();
	    }

	    int x = Integer.parseInt(sc.nextLine()) - 1;
	    int y = Integer.parseInt(sc.nextLine()) - 1;

	    simulationDfs(field, x, y, 0, 0);

	    System.out.printf("Data %d:\n", i);
	    printField(field);
	}
    }

    private static void simulationDfs(char[][] field, int x, int y, int bomb, int dir){
	if(y < 0 || x < 0 || y > 7 || x > 7){
	    return;
	}

	if(field[y][x] == '1'){
	    field[y][x] = '0';

	    for(int i = 0; i < 4; ++i){
		simulationDfs(field, x+xdir[i], y+ydir[i], chein_length, i);
	    }
	}

	if(bomb > 0){
	    simulationDfs(field, x+xdir[dir], y+ydir[dir], bomb-1, dir);
	}
    }

    private static void printField(char[][] field){
	for(int i = 0; i < field_size; ++i){
	    for(int j = 0; j < field_size; ++j){
		System.out.print(field[i][j]);
	    }
	    System.out.println();
	}
    }
}