import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);

	//0121
	static class SevenPuzzle {
		String puzzle;
		int[] dir = {1, -1, 4, -4};

		void print_min_movedNum() {
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			Queue<String> que = new LinkedList<String>();
			que.offer("01234567");
			map.put("01234567", 0);

			while(!que.isEmpty()) {
				String npuzzle = que.poll();
				int ind = npuzzle.indexOf('0');
				for(int i=0; i<4; i++) {
					if(ind % 4 == 0 && i == 1) continue;
					if(ind % 4 == 3 && i == 0) continue;
					if(!check(ind + dir[i])) continue;
					swap(npuzzle, ind, i);
					if(map.containsKey(puzzle)) continue;
					que.offer(puzzle);
					map.remove(puzzle);
					map.put(puzzle, new Integer(map.get(npuzzle) + 1));
				}
			}

			while(sc.hasNext()) {
				StringBuffer sb = new StringBuffer();
				for(int i=0; i<8; i++) {sb.append(sc.nextInt());}
				System.out.println(map.get(new String(sb)));
			}
		}

		boolean check(int n) {return n >= 0 && n < 8;}

		void swap(String npuzzle, int ind, int i) {
			StringBuffer sb = new StringBuffer(npuzzle);
			char tmp = sb.charAt(ind);
			sb.setCharAt(ind, sb.charAt(ind + dir[i]));
			sb.setCharAt(ind + dir[i], tmp);
			puzzle = new String(sb);
		}
	}

	public static void main(String[] args) {
		// 0121
		SevenPuzzle sp = new SevenPuzzle();
		sp.print_min_movedNum();
	}
}