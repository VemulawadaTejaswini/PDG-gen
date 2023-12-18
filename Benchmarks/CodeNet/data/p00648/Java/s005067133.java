import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);

	//1063
	static class WatchinTVA {
		void print_max_watchNum() {
			for(;;) {
				int n = sc.nextInt();
				if(n == 0) break;
				List<Program> list = new ArrayList<Program>();
				for(int i=0; i<n; i++) {
					String name = sc.next();
					int weekDay = sc.nextInt();
					int start = sc.nextInt();
					if(start >= 2400) {
						if(weekDay+1 > 6) weekDay = 0;
						else weekDay++;
						start -= 2400;
					}
					list.add(new Program(name, toTime(weekDay, start), toTime(weekDay, start+30)));
				}
				Collections.sort(list, new ProgramComparator());

				int p = sc.nextInt();
				List<Program> favList = new ArrayList<Program>();
				for(int i=0; i<p; i++) {
					String fav = sc.next();
					for(Program l:list) {
						if(fav.equals(l.name)) {favList.add(l);}
					}
				}
				Collections.sort(favList, new ProgramComparator());

				boolean ans = true;
				for(int i=1; i<p; i++) {
					if(favList.get(i).end - favList.get(i-1).end < 30) ans = false;
				}

				if(!ans) {
					System.out.println(-1);
				}else {
					int num=0, lastP=0;
					for(int i=0; i<n; i++) {
						boolean judge = true;
						for(Program l:favList) {
							if(list.get(i).name.equals(l.name))
								break;
							else if(Math.abs(l.start - list.get(i).start) < 30)
								judge = false;
						}
						if(judge) {
							if(lastP <= list.get(i).start) {
								num++;
								lastP = list.get(i).end;
							}
						}
					}
					System.out.println(num);
				}
			}
		}

		int toTime(int wd, int s) {
			int h = s / 100; int m = s % 100;
			return (wd * 10000) + ((h + m/60)*100) + (m % 60);
		}
	}

	static class Program {
		public String name;
		public int start, end;
		public Program(String name, int start, int end) {
			this.name = name;
			this.start = start; this.end = end;
		}
	}

	static class ProgramComparator implements java.util.Comparator<Program> {
		public int compare(Program f, Program s) {
			return ((Program)f).end - ((Program)s).end;
		}
	}

	public static void main(String[] args) {
		//1063
		WatchinTVA wt = new WatchinTVA();
		wt.print_max_watchNum();
	}
}