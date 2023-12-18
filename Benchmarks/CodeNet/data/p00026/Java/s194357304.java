
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc1 = new Scanner(System.in);
		int [][] cells = new int [10][10];
		while(sc1.hasNext()){
			String temp = sc1.next();
			Scanner sc2 = new Scanner(temp);
			sc2.useDelimiter(",");
			int x = sc2.nextInt();
			int y = sc2.nextInt();
			int ink = sc2.nextInt();
			switch(ink){
			case 3:
				if((x-2) >= 0) cells[y][x-2]++;
				if((x+2) <= 9) cells[y][x+2]++;
				if((y-2) >= 0) cells[y-2][x]++;
				if((y+2) <= 9) cells[y+2][x]++;
			case 2:
				if((y-1) >= 0){
					if((x-1) >= 0) cells[y-1][x-1]++;
					if((x+1) <= 9) cells[y-1][x+1]++;
				}
				if((y+1) >= 0){
					if((x-1) >= 0) cells[y+1][x-1]++;
					if((x+1) <= 9) cells[y+1][x+1]++;
				}
			case 1:
				if((x-1) >= 0) cells[y][x-1]++;
				if((x+1) <= 9) cells[y][x+1]++;
				if((y-1) >= 0) cells[y-1][x]++;
				if((y+1) <= 9) cells[y+1][x]++;
				cells[y][x]++;
				break;
			}
		}

		int count = 0;
		int maxInk = 0;
		for(int i=0; i < 10; i++){
			for(int j=0; j < 10; j++){
				if(cells[i][j] == 0){
					count++;
				}
				else if(maxInk < cells[i][j]){
					maxInk = cells[i][j];
				}
			}
		}

		System.out.println(count);
		System.out.println(maxInk);

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}