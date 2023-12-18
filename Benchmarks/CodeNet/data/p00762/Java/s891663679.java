import java.util.Scanner;

class Point3D{
	int x, y, z;
	
	Point3D(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	Point3D uped(){
		return new Point3D(x, y-1, z+1);
	}
	
	Point3D downed(){
		return new Point3D(x, y+1, z+1);
	}
	
	Point3D lefted(){
		return new Point3D(x-1, y, z+1);
	}
	
	Point3D righted(){
		return new Point3D(x+1, y, z+1);
	}
	
	public String toString(){
		return "("+x+", "+y+", "+z+")";
	}
}

class BiasedDice{
	int top, bottom, up, down, left, right;
	static final int CANOT_ROLL = 0;
	Point3D pos;
	
	private int[][] dice = {
			{2, 4, 5, 3},
			{6, 4, 1, 3},
			{6, 2, 1, 5},
			{6, 5, 1, 2},
			{6, 3, 1, 4},
			{2, 3, 5, 4}
	};
	
	public BiasedDice(int top, int front) {
		this.top = top;
		bottom = 7 - top;
		down = front;
		up =  7 - down;
		int leftIdx = 0;
		while(dice[top-1][leftIdx] != front) leftIdx++;
		
		left =  dice[top-1][(leftIdx+1)%4];
		right = 7 - left;
	}
	
	public BiasedDice(int top, int left, int up, Point3D pos) {
		this.top = top;
		this.bottom = 7 - top;
		this.left = left;
		this.right = 7- left;
		this.up = up;
		this.down = 7- up;
		this.pos = pos;
	}
	
	public String toString(){
		// return "["+"up: "+up+" down: "+down+" left: "+left+" right: "+right+"]";
		return "["+ top +"] "+left +" "+ up +" "+ right +" "+ down;
	}
	
	
	BiasedDice rollUped(){
		// top left up
		return new BiasedDice(down, left, top, pos.uped());
	}
	
	BiasedDice rollDowned(){
		return new BiasedDice(up, left, bottom, pos.downed());
	}
	
	BiasedDice rollLefted(){
		return new BiasedDice(right, top, up, pos.lefted());
	}
	
	BiasedDice rollRighted(){
		return new BiasedDice(left, bottom, up, pos.righted());
	}
}

class Field3D{
	static final int N = 100, WIDTH = 100, CENTER = WIDTH/2;;
	final int BASE = -1, BLANK = 0;
	int[][][] field = new int[WIDTH][WIDTH][N+1];
	int[] state = new int[7];
	
	public Field3D() {
		init();
	}
	
	void init(){
		for(int i = 0; i < WIDTH; i++){
			for(int j = 0; j < WIDTH; j++){
				for(int k = 0; k < N+1; k++){
					field[i][j][k] = (k == N)? BASE: BLANK;
				}
			}
		}
		for(int i = 0; i < state.length; i++) state[i] =0;
	}
	
	int get(int x, int y, int z){
		return field[x][y][z];
	}
	
	int get(int z){
		return get(CENTER, CENTER, z);
	}
	
	int get(Point3D p){
		return get(p.x, p.y, p.z);
	}
	
	void drop(BiasedDice dice){
		
		dice.pos = new Point3D(CENTER, CENTER, N-1);
		
		while(get(dice.pos) != BLANK) dice.pos.z--;
		
		BiasedDice droppedDice = roll(dice);
		setDice(droppedDice);
		
	}
	
	boolean isBlank(Point3D p){
		return get(p) == BLANK;
	}
		
	
	
	BiasedDice roll(BiasedDice dice){

		for(int i = 6; i >=4; i--){
			if(isBlank(dice.pos.uped()) && dice.up == i) return roll( dice.rollUped()); else
			if(isBlank(dice.pos.downed()) && dice.down == i) return roll( dice.rollDowned()); else
			if(isBlank( dice.pos.lefted()) && dice.left == i) return roll( dice.rollLefted()); else
			if(isBlank(dice.pos.righted()) && dice.right == i) return roll( dice.rollRighted());
		}
		return dice;
	}
	
	void setDice(BiasedDice dice){
		int bottomState = field[dice.pos.x][dice.pos.y][dice.pos.z+1];
		if(bottomState != BASE) state[bottomState]--;
		state[dice.top]++;
		field[dice.pos.x][dice.pos.y][dice.pos.z] = dice.top;
	}
	
	String getState(){
		String out = "";
		for(int i = 1; i < state.length-1; i++) out += state[i]+" ";
		return out+state[6];
	}
}



public class Main {
	public static void main(String[] args){
		int n;
		Scanner sn = new Scanner(System.in);
		Field3D field3d = new Field3D();
		while((n = sn.nextInt()) != 0){
			field3d.init();
			for(int i = 0; i < n; i++) {
				field3d.drop(new BiasedDice(sn.nextInt(), sn.nextInt()));
			}
			System.out.println(field3d.getState());		
		}

	}
}