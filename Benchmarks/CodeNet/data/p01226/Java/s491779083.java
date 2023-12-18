import java.util.Scanner;

class Mass {
	int x;
	int y;
	/*
	 * 1 = 平地 2 = レンガの壁 3 = 鉄の壁 4 = 水 5 = 戦車
	 */
	int state;

	public Mass(int x, int y, char state) {
		this.x = x;
		this.y = y;
		if (state == '.')
			this.state = 1;
		else if (state == '*')
			this.state = 2;
		else if (state == '#')
			this.state = 3;
		else if (state == '-')
			this.state = 4;
		else
			this.state = 1;
	}

	public Mass(int x, int y, int state) {
		this.x = x;
		this.y = y;
		this.state = state;
	}

	public boolean shoot() {
		if (this.state == 2)
			return true;
		else
			return false;
	}

	public char printMass() {
		if (state == 1)
			return '.';
		if (state == 2)
			return '*';
		if (state == 3)
			return '#';
		if (state == 4)
			return '-';
		else
			return 'x';
	}
}

class Area {
	Mass[][] mass;
	Sensya sensya;
	int x_max;
	int y_max;

	public Area(int x_max, int y_max) {

		Mass[][] m = new Mass[x_max][y_max];
		this.mass = m;
		this.x_max = x_max;
		this.y_max = y_max;
	}

	public void printArea() {
		char print[][] = new char[this.x_max][this.y_max];
		for (int i = 0; i < x_max; i++) {
			for (int j = 0; j < y_max; j++) {
				print[i][j] = this.mass[i][j].printMass();
			}
		}

		print[this.sensya.mass.x][this.sensya.mass.y] = sensya.printSensya();
		for (int i = 0; i < this.x_max; i++) {
			for (int j = 0; j < this.y_max; j++) {
				System.out.print(print[i][j]);
			}
			System.out.println();
		}

	}

	public void doMessage(int mesNum, String mes) {
		for (int i = 0; i < mesNum; i++) {
			char a = mes.charAt(i);
			switch (a) {
			case 'U':
				if (this.sensya.mass.x == 0)
					this.sensya.move(a, null);
				else
					this.sensya
							.move(a,
									this.mass[this.sensya.mass.x - 1][this.sensya.mass.y]);
				break;
			case 'D':
				if (this.sensya.mass.x == x_max - 1)
					this.sensya.move(a, null);
				else
					this.sensya
							.move(a,
									this.mass[this.sensya.mass.x + 1][this.sensya.mass.y]);
				break;
			case 'L':
				if (this.sensya.mass.y == 0)
					this.sensya.move(a, null);
				else
					this.sensya
							.move(a,
									this.mass[this.sensya.mass.x][this.sensya.mass.y - 1]);
				break;
			case 'R':
				if (this.sensya.mass.y == y_max - 1)
					this.sensya.move(a, null);
				else
					this.sensya
							.move(a,
									this.mass[this.sensya.mass.x][this.sensya.mass.y + 1]);
				break;
			case 'S':
				if (this.sensya.direction == 1) {
					int f = 0;
					for (int i1 = sensya.mass.x; i1 >= 0; i1--) {
						f = this.mass[i1][sensya.mass.y].state;
						if (f == 2) {
							this.mass[i1][sensya.mass.y].state = 1;
							break;
						} else if (f == 3) {
							break;
						}
					}
				} else if (this.sensya.direction == 3) {
					int f = 0;
					for (int i1 = sensya.mass.x; i1 < x_max; i1++) {
						f = this.mass[i1][sensya.mass.y].state;
						if (f == 2) {
							this.mass[i1][sensya.mass.y].state = 1;
							break;
						} else if (f == 3) {
							break;
						}
					}
				} else if (this.sensya.direction == 4) {
					int f = 0;
					for (int i1 = sensya.mass.y; i1 >= 0; i1--) {
						f = this.mass[sensya.mass.x][i1].state;
						if (f == 2) {
							this.mass[sensya.mass.x][i1].state = 1;
							break;
						} else if (f == 3) {
							break;
						}
					}
				} else if (this.sensya.direction == 2) {
					int f = 0;
					for (int i1 = sensya.mass.y; i1 < y_max; i1++) {
						f = this.mass[sensya.mass.x][i1].state;
						if (f == 2) {
							this.mass[sensya.mass.x][i1].state = 1;
							break;
						} else if (f == 3) {
							break;
						}
					}
				}
				break;
			}
		}
	}

	public Mass search_mass(int x, int y) {
		return this.mass[x][y];
	}

}

class Sensya {
	Mass mass;
	/*
	 * 1 = 上 2 = 右 3 = 下 4 = 左
	 */
	int direction;

	public Sensya(int x, int y, char direction) {
		this.mass = new Mass(x, y, direction);
		if (direction == '^')
			this.direction = 1;
		else if (direction == 'v')
			this.direction = 3;
		else if (direction == '<')
			this.direction = 4;
		else if (direction == '>')
			this.direction = 2;
	}

	public void direction_change(char s) {
		if (s == 'U') {
			direction = 1;
		}
		if (s == 'D') {
			direction = 3;
		}
		if (s == 'L') {
			direction = 4;
		}
		if (s == 'R') {
			direction = 2;
		}
	}

	public char printSensya() {
		if (direction == 1)
			return '^';
		if (direction == 2)
			return '>';
		if (direction == 3)
			return 'v';
		if (direction == 4)
			return '<';
		else
			return 'y';
	}

	public void move(char s, Mass mass) {
		switch (s) {
		case 'U':
			if (mass == null)
				direction_change(s);
			else {
				direction_change(s);
				if (mass.state == 1)
					this.mass.x -= 1;
			}
			break;
		case 'D':
			if (mass == null)
				direction_change(s);
			else {
				direction_change(s);
				if (mass.state == 1)
					this.mass.x += 1;
			}
			break;
		case 'L':
			if (mass == null)
				direction_change(s);
			else {
				direction_change(s);
				if (mass.state == 1)
					this.mass.y -= 1;
			}
			break;
		case 'R':
			if (mass == null)
				direction_change(s);
			else {
				direction_change(s);
				if (mass.state == 1)
					this.mass.y += 1;
			}
			break;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int z = 0; z < N; z++) {
			int x_max = sc.nextInt();
			int y_max = sc.nextInt();
			Area area = new Area(x_max, y_max);
			for (int i = 0; i < x_max; i++) {
				String s = sc.next();
				for (int j = 0; j < y_max; j++) {
					char mes = s.charAt(j);
					if (mes == '^' || mes == 'v' || mes == '<' || mes == '>')
						area.sensya = new Sensya(i, j, mes);
					area.mass[i][j] = new Mass(i, j, mes);
				}
			}
			int mes_num = sc.nextInt();
			String mes = sc.next();
			area.doMessage(mes_num, mes);
			area.printArea();
			if (z != N - 1)
				System.out.println();
		}
	}
}