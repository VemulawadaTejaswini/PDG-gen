import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
static class Amap {
char[][] field;

Amap(int h, int w) {
  this.field = new char[h + 2][w + 2];
  Arrays.fill(field[0], SF);
  Arrays.fill(field[h + 1], SF);
  for (char[] line : field) {
	line[0] = SF;
	line[w + 1] = SF;
  }
}

void setField(int x, int y, char c) {
  if (dMap.containsValue(c)) c = GF;
  field[y][x] = c;
}

char getField(int[] xy) {
  return field[xy[Y]][xy[X]];
}

}

static class Tank {
Amap  map;
int[] posi = new int[2];
char  d;

Tank(Amap map) {
  this.map = map;
}

void move(char order) {
  this.d = dMap.get(order);
  int[] movePoint = move(new int[] { posi[X], posi[Y] });
  if (map.getField(movePoint) == GF) {
	posi = movePoint;
  }
}

int[] move(int[] posi) {
  if (d == '^') {
	posi[Y]--;
  } else if (d == 'v') {
	posi[Y]++;
  } else if (d == '<') {
	posi[X]--;
  } else if (d == '>') {
	posi[X]++;
  }
  return posi;
}

void order(char o) {
  if (dMap.containsKey(o)) {
	move(o);
  } else {
	shot();
  }
}

void setPosi(int x, int y, char d) {
  posi[X] = x;
  posi[Y] = y;
  this.d = d;
}

void shot() {
  int[] beam = { posi[X], posi[Y] };
  boolean isStop = false;
  while (!isStop) {
	char cf = map.getField(beam);
	switch (cf) {
	case RF:
	  map.setField(beam[X], beam[Y], GF);
	case SF:
	  isStop = true;
	  break;
	default:
	  move(beam);
	  break;
	}
  }
}
}

static final int                 X  = 0;
static final int                 Y  = 1;
private static final char        GF = '.';
private static final char        SF = '#';
private static final char        RF = '*';
private static final char        WF = '-';
private static final char        UT = '^';
private static final char        DT = 'v';
private static final char        RT = '>';
private static final char        LT = '<';

static Map<Character, Character> dMap;

static {
  dMap = new HashMap<Character, Character>();
  dMap.put('R', RT);
  dMap.put('L', LT);
  dMap.put('U', UT);
  dMap.put('D', DT);
}

public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  Amap map;
  Tank tank;
  while (in.hasNext()) {
	int t = in.nextInt();
	for (int dataSet = 0; dataSet < t; dataSet++) {
	  final int h = in.nextInt();
	  final int w = in.nextInt();
	  tank = new Tank(map = new Amap(h, w));
	  for (int y = 1; y <= h; y++) {
		String line = in.next();
		for (int x = 1; x <= w; x++) {
		  char field = line.charAt(x - 1);
		  if (dMap.containsValue(field)) {
			tank.setPosi(x, y, field);
			field = GF;
		  }
		  map.setField(x, y, field);

		}
	  }
	  int len = in.nextInt();
	  String orders = in.next();
	  for (int n = 0; n < len; n++) {
		final char order = orders.charAt(n);
		tank.order(order);
	  }
	  int[] posi = new int[2];
	  for (int y = 1; y <= h; y++) {
		posi[Y] = y;
		for (int x = 1; x <= w; x++) {
		  posi[X] = x;
		  if (tank.posi[X] == x && tank.posi[Y] == y) {
			System.out.print(tank.d);
		  } else {
			System.out.print(map.getField(posi));
		  }
		}
		System.out.println();
	  }
	  if (dataSet < t - 1) {
		System.out.println();
	  }
	}
  }
}
}