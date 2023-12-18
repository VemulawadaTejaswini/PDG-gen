import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		Main[] dices = new Main[count];
		for(int i = 0;i < count;i++) {
			dices[i] = new Main(sc);
		}

		int point = 0;

		for(int i = 0;i < count ;i++) {
			for(int j = i + 1;j < count;j++) {

				int roll = 0;
				if(dices[j].top == dices[i].south || dices[j].top == dices[i].north || dices[j].top == dices[i].bottom) {
					while(dices[j].top != dices[i].top) {
						dices[i].goNorth();
						roll++;
					}
					if(roll > 0) {
						while(dices[j].bottom != dices[i].bottom) {
							dices[i].goNorth();
							roll++;
						}
					}
				} else if(dices[j].top == dices[i].west || dices[j].top == dices[i].east) {
					while(dices[j].top != dices[i].top) {
						dices[i].goEast();

					}
				}

				if(dices[j].south == dices[i].east || dices[j].south == dices[i].west || dices[j].south == dices[i].north ) {
					while(dices[j].south != dices[i].south) {
						dices[i].spin();
					}
				}

				if(dices[j].east == dices[i].east && dices[j].west == dices[i].west && dices[j].north == dices[i].north && dices[j].bottom == dices[i].bottom) {
					point++;
				}

			}
		}
		

		if(point > 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
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


}