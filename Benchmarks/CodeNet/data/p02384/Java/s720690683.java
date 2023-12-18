import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){

		int[] d = new int[6];
		for(int i = 0; i < 6; i++){
			d[i] = scan.nextInt();
		}
		Dice dice = new Dice(d);
		int q = scan.nextInt();
		for(int i = 0; i < q; i++){
			int n = scan.nextInt();
			int m = scan.nextInt();
			dice.setTop(n);
			dice.setSouth(m);
			System.out.println(dice.show(Dice.EAST));
		}
	}
}

class Dice{

	int[] _d = new int[6];
	public static final int
		Top = 0, SOUTH = 1, EAST = 2,
		WEST = 3, NORTH = 4, BOTTOM = 5;

	public Dice(int[] d){ 
		for(int i = 0; i < 6; i++){
			_d[i] = d[i];
		}
	}

	public int show(int side){
		return _d[side];
	}

	public void setTop(int num){
		if(_d[TOP] != num){
			if(_d[SOUTH] == num){
				moveNorth();
			} else if(_d[EAST] == num){
				moveWest();
			} else if(_d[WEST] == num){
				moveEast();
			} else if(_d[NORTH] == num){
				moveSouth();
			} else if(_d[BOTTOM] == num){
				moveSouth();
				moveSouth();
			}
		}
	}

	public void setSouth(int num){
		for(int i = 0; i < 4; i++){
			if(_d[SOUTH] != num){
				moveRight();
			}
		}
	}

	private void moveSouth(){
		int tmp = _d[TOP];
		_d[TOP] = _d[NORTH];
		_d[NORTH] = _d[BOTTOM];
		_d[BOTTOM] = _d[SOUTH];
		_d[SOUTH] = tmp;
	}

	private void moveEast(){
		int tmp = _d[TOP];
		_d[TOP] = _d[WEST];
		_d[WEST] = _d[BOTTOM];
		_d[BOTTOM] = _d[EAST];
		_d[EAST] = tmp;
	}

	private void moveWest(){
		int tmp = _d[TOP];
		_d[TOP] = _d[EAST];
		_d[EAST] = _d[BOTTOM];
		_d[BOTTOM] = _d[WEST];
		_d[WEST] = tmp;
	}

	private void moveNorth(){
		int tmp = _d[TOP];
		_d[TOP] = _d[SOUTH];
		_d[SOUTH] = _d[BOTTOM];
		_d[BOTTOM] = _d[NORTH];
		_d[NORTH] = tmp;
	}

	private void moveRight(){
		int tmp = _d[SOUTH];
		_d[SOUTH] = _d[WEST];
		_d[WEST] = _d[NORTH];
		_d[NORTH] = _d[EAST];
		_d[EAST] = tmp;
	}
}