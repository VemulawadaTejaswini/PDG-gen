import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);
	static boolean flag = false;

	public static void main(String[] args){
		
		int n = scan.nextInt();
		int[] d = new int[6];
		Dice[] dices = new Dice[n];

		
		for(int i = 0; i < n ; i++){
			for(int j = 0; j < 6; j++){
				d[j] = scan.nextInt();
			}
			Object objs = (Object) d;
			dices[i] = new Dice((Object) objs);
		}

		boolean ans = true;
		for(int i = 0; ans && i < n; i++){
			for(int j = i + 1; j < n; j++){
				if(dices[i].equals(dices[j])){
					ans = false;
					break;
				}
			}
		}
		System.out.println(ans? "Yes" : "No");
	}
}

class Dice{

	int[] _d = new int[6];
	public static final int
		TOP = 0, SOUTH = 1, EAST = 2,
		WEST = 3, NORTH = 4, BOTTOM = 5; // ?????°

	public Dice(Object... obj){ // ?????????????????????
		for(int i = 0; i < 6; i++){
			if(obj instanceof int[]){
				int[] d = (int[]) obj;
				_d[i] = d[i];
			}
		}
	}

	public int[] showAll(){
		return _d;
	}

	@Override
	public boolean equals(Object obj){
		boolean result = false;
		Dice dice = (Dice) obj;
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				if(Arrays.equals(showAll(), dice.showAll())){
					result = true;
					break;
				}
				dice.rollEast();
			}
			for(int j = 0; j < 4; j++){
				if(Arrays.equals(showAll(), dice.showAll())){
					result = true;
					break;
				}
				dice.rollNorth();
			}
			if(Arrays.equals(showAll(), dice.showAll())){
				result = true;
				break;
			}
			dice.rollRight();
		}
		return result;
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