import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int[] d = new int[6];
		int n = scan.nextInt();
		Dice[] dices = new Dice[n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < 6; j++){
				d[j] = scan.nextInt();
			}
			dices[i] = new Dice(d);
		}

		boolean flag = false;
		boolean ans = true;
		for(int i = 0; i < n - 1; i++){
			for(int j = i + 1; j < n; j++){
				flag = dices[i].equals(dices[j]);
				if(flag == true){
					ans = false;
					break;
				}
			}
		}
		System.out.println(ans? "Yes" : "No");
	}
}

class Dice{
	int[] d_ = new int[6];
	public static final int
		TOP = 0, SOUTH = 1, EAST = 2,
		WEST = 3, NORTH = 4, BOTTOM = 5;

	public Dice(int[] d){
		for(int i = 0; i < 6; i++){
			d_[i] = d[i];
		}
	}

	@Override
	public boolean equals(Object obj){
		boolean result = false;
		if(obj instanceof Dice)
			Dice diceB = (Dice) obj;
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					result = Arrays.equals(this.d_, diceB.d_);
					if(result == true)break;
					diceB.rollEast();
				}
				for(int j = 0; j < 4; j++){
					result = Arrays.equals(this.d_, diceB.d_);
					if(result == true)break;
					diceB.rollSouth();
				}
				result = Arrays.equals(this.d_, diceB.d_);
				if(result == true)break;
				diceB.rollRight();
			}
			return result;
		}
		return result;
	}

	public void setTop(int num){
		if(num == d_[EAST]){
			this.rollWest();
		} else if(num == d_[WEST]){
			this.rollEast();
		} else if(num == d_[SOUTH]){
			this.rollNorth();
		} else if(num == d_[NORTH]){
			this.rollSouth();
		} else if(num == d_[BOTTOM]){
			this.rollEast();
			this.rollEast();
		}
	}

	public void setSouth(int num){
		if(num == d_[EAST]){
			this.rollRight();
			this.rollRight();
			this.rollRight();
		} else if(num == d_[WEST]){
			this.rollRight();
		} else if(num == d_[NORTH]){
			this.rollRight();
			this.rollRight();
		}
	}

	public int show(int side){
		return d_[side];
	}

	public void rollEast(){
		int work = d_[TOP];
		d_[TOP] = d_[WEST];
		d_[WEST] = d_[BOTTOM];
		d_[BOTTOM] = d_[EAST];
		d_[EAST] = work;
	}

	public void rollWest(){
		int work = d_[TOP];
		d_[TOP] = d_[EAST];
		d_[EAST] = d_[BOTTOM];
		d_[BOTTOM] = d_[WEST];
		d_[WEST] = work;
	}

	public void rollSouth(){
		int work = d_[TOP];
		d_[TOP] = d_[NORTH];
		d_[NORTH] = d_[BOTTOM];
		d_[BOTTOM] = d_[SOUTH];
		d_[SOUTH] = work;
	}

	public void rollNorth(){
		int work = d_[TOP];
		d_[TOP] = d_[SOUTH];
		d_[SOUTH] = d_[BOTTOM];
		d_[BOTTOM] = d_[NORTH];
		d_[NORTH] = work;
	}

	public void rollRight(){
		int work = d_[SOUTH];
		d_[SOUTH] = d_[WEST];
		d_[WEST] = d_[NORTH];
		d_[NORTH] = d_[EAST];
		d_[EAST] = work;
	}
}