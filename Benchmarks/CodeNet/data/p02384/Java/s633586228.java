import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main dice = new Main(sc);
		int count = sc.nextInt();


		for(int i = 0;i < count;i++){
			int ansTop = sc.nextInt();
			int ansSouth = sc.nextInt();

			if(ansTop == dice.south || ansTop == dice.north || ansTop == dice.bottom) {
				while(ansTop != dice.top) {
					dice.goNorth();
				}
			} else {
				while(ansTop != dice.top) {
					dice.goEast();
				}
			}

			while(ansSouth != dice.south) {
				dice.spin();
			}

			System.out.println(dice.getEast());

		}


	}

	int top;
	int south;
	int east;
	int west;
	int north;
	int bottom;


	public Main(Scanner sc) {
		this.top = sc.nextInt();
		this.south = sc.nextInt();
		this.east = sc.nextInt();
		this.west = sc.nextInt();
		this.north = sc.nextInt();
		this.bottom = sc.nextInt();
	}

	public void goNorth() {
		int t = this.top;
		int s = this.south;
		int e = this.east;
		int w = this.west;
		int n = this.north;
		int b = this.bottom;

		this.top = s;
		this.south = b;
		this.north = t;
		this.bottom = n;
	}

	public void goSouth() {
		int t = this.top;
		int s = this.south;
		int e = this.east;
		int w = this.west;
		int n = this.north;
		int b = this.bottom;

		this.top = n;
		this.south = t;
		this.north = b;
		this.bottom = s;
	}

	public void goEast() {
		int t = this.top;
		int s = this.south;
		int e = this.east;
		int w = this.west;
		int n = this.north;
		int b = this.bottom;

		this.top = w;
		this.east = t;
		this.west = b;
		this.bottom = e;
	}

	public void goWest() {
		int t = this.top;
		int s = this.south;
		int e = this.east;
		int w = this.west;
		int n = this.north;
		int b = this.bottom;

		this.top = e;
		this.east = b;
		this.west = t;
		this.bottom = w;
	}

	public void spin() {
		int t = this.top;
		int s = this.south;
		int e = this.east;
		int w = this.west;
		int n = this.north;
		int b = this.bottom;


		this.south = w;
		this.east = s;
		this.west = n;
		this.north = e;


	}


	public int getTop() {
		return this.top;
	}

	public int getEast() {
		return this.east;
	}
}