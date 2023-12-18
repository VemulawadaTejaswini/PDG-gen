import java.util.*;
import Dice.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		
		int[] d = new int[6];
		for(int i = 0; i < 6; i++){
			d[i] = scan.nextInt();
		}
		Dice dice1 = new Dice(d);
		for(int i = 0; i < 6; i++){
			d[i] = scan.nextInt();
		}
		Dice dice2 = new Dice(d);
		int numT = dice1._d[TOP];
		int numS = dice1._d[SOUTH];
		boolean flg;
		dice2.setTop(numT);
		if(dice2.setSouth(numS)){
			if((dice1._d[NORTH] == dice2._d[NORTH]) && (dice1._d[EAST] == dice2._d[EAST]) && 
				(dice1._d[WEST] == dice2._d[WEST]) && (dice1._d[BOTTOM] == dice2._d[BOTTOM])){
				flg = true;
			} else{
				flg = false;
			}
		} else{
			flg = false;
		}
		System.out.println(flg? "Yes" : "No");
	}
}

class Dice{

	int[] _d = new int[6];
	public static final int
		TOP = 0, SOUTH = 1, EAST = 2,
		WEST = 3, NORTH = 4, BOTTOM = 5; // ?????°

	public Dice(int[] d){ // ?????????????????????
		for(int i = 0; i < 6; i++){
			_d[i] = d[i];
		}
	}

	public int show(int side){ // ??????????????????????????????
		return _d[side];
	}

	public void setTop(int num){
		if(_d[SOUTH] == num){
			rollNorth();
		} else if(_d[EAST] == num){
			rollWest();
		} else if(_d[WEST] == num){
			rollEast();
		} else if(_d[NORTH] == num){
			rollSouth();
		} else if(_d[BOTTOM] == num){
			rollNorth();
			rollNorth();
		}
	}

	public boolean setSouth(int num){
		for(int i = 0; i < 3; i++){
			if(_d[SOUTH] != num){
				rollRight();
			} else{
				return true;
			}
		}
		return false;
	}

	public void rollSouth(){
		int tmp = _d[TOP];
		_d[TOP] = _d[NORTH];
		_d[NORTH] = _d[BOTTOM];
		_d[BOTTOM] = _d[SOUTH];
		_d[SOUTH] = tmp;
	}

	public void rollNorth(){
		int tmp = _d[TOP];
		_d[TOP] = _d[SOUTH];
		_d[SOUTH] = _d[BOTTOM];
		_d[BOTTOM] = _d[NORTH];
		_d[NORTH] = tmp;
	}

	public void rollEast(){
		int tmp = _d[TOP];
		_d[TOP] = _d[WEST];
		_d[WEST] = _d[BOTTOM];
		_d[BOTTOM] = _d[EAST];
		_d[EAST] = tmp;
	}

	public void rollWest(){
		int tmp = _d[TOP];
		_d[TOP] = _d[EAST];
		_d[EAST] = _d[BOTTOM];
		_d[BOTTOM] = _d[WEST];
		_d[WEST] = tmp;
	}

	public void rollRight(){
		int tmp = _d[SOUTH];
		_d[SOUTH] = _d[WEST];
		_d[WEST] = _d[NORTH];
		_d[NORTH] = _d[EAST];
		_d[EAST] = tmp;
	}
}