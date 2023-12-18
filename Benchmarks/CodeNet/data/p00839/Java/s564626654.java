

import java.util.*;
public class Main {
	//1330 start
	//1430 cording end
	//1510 sample matched RE
	//1510 stop

	class C{
		int step;
		StringBuilder [] list;
		public C(int step, StringBuilder[] list) {
			this.step = step;
			this.list = list;
		}

	}

	private void doit(){
		Scanner sc =new Scanner(System.in);
		while(true){
			int x = sc.nextInt(), y = sc.nextInt();
			if((x|y) == 0) break;
			char [][] data = new char[y][4];
			for(int i = 0 ; i < y; i++){
				String s = sc.next();
				data[i][0] = s.charAt(0);
				data[i][1] = s.charAt(1);
				s = sc.next();

				data[i][2] = s.charAt(0);
				data[i][3] = s.charAt(1);
			}
			String [] start = new String[x];
			String [] goal = new String[x];
			for(int i = 0; i < 2; i++){
				for(int j = 0; j < x;j++){
					if(i == 0){
						start[j] = sc.next();
						if(start[j].equals("-")){
							start[j] = "";
						}
					}
					else{
						goal[j] = sc.next();
						if(goal[j].equals("-")){
							goal[j] = "";
						}
					}
				}
			}

			LinkedList<C> open = new LinkedList<C>();
			StringBuilder [] openlist = new StringBuilder[x];
			for(int i = 0; i < x; i++){
				openlist[i] = new StringBuilder(start[i]);
			}
			open.add(new C(0, openlist));
			HashMap<String , Integer> close = new HashMap<String, Integer>();
			close.put(tostr(openlist), 0);
			String goalstr = tostr2(goal);
			int ans = -1;
			while(! open.isEmpty()){
				C now = open.removeFirst();
				//System.out.println("step = " + now.step);
				if(tostr(now.list).equals(goalstr)){
					ans = now.step;
					break;
				}
				if(now.step + 1 == 3) break;

				for(int i = 0; i < y; i++){
					int num1 = data[i][0] - '0';
					int num2 = data[i][2] - '0';
					char op1 = data[i][1];
					char op2 = data[i][3];

					if(op1 == 'W' && op2 == 'W'){
						//from to
						for(int j = 0; j < now.list[num1].length(); j++){

							String temp = now.list[num1].substring(0, j + 1);
							StringBuilder move = new StringBuilder(temp);
							move.reverse();

							StringBuilder [] work = deepcopy(now.list);
							work[num1].delete(0, j + 1);
							work[num2].insert(0, move.toString());
							String nextstr = tostr(work);
							if(close.containsKey(nextstr) && close.get(nextstr) <= now.step + 1){
								continue;
							}
							open.add(new C(now.step + 1, work));
							close.put(nextstr, now.step + 1);
						}

						//to from
						for(int j = 0; j < now.list[num2].length(); j++){
							String temp = now.list[num2].substring(0, j + 1 );
							StringBuilder move = new StringBuilder(temp);
							move.reverse();

							StringBuilder [] work = deepcopy(now.list);
							work[num2].delete(0, j + 1);
							work[num1].insert(0, move.toString());
							String nextstr = tostr(work);
							if(close.containsKey(nextstr) && close.get(nextstr) <= now.step + 1){
								continue;
							}
							open.add(new C(now.step + 1, work));
							close.put(nextstr, now.step + 1);
						}
					}
					else if(op1 == 'W' && op2 == 'E'){
						//from to
						for(int j = 0; j < now.list[num1].length(); j++){
							String temp = now.list[num1].substring(0, j + 1);
							StringBuilder move = new StringBuilder(temp);

							StringBuilder [] work = deepcopy(now.list);
							work[num1].delete(0, j + 1);
							work[num2].append(move.toString());
							String nextstr = tostr(work);
							if(close.containsKey(nextstr) && close.get(nextstr) <= now.step + 1){
								continue;
							}
							open.add(new C(now.step + 1, work));
							close.put(nextstr, now.step + 1);
						}

						//to from
						for(int j =0; j < now.list[num2].length(); j++){
							int len = now.list[num2].length();
							String temp = now.list[num2].substring(len - j - 1, len);
							StringBuilder move = new StringBuilder(temp);

							StringBuilder [] work = deepcopy(now.list);
							work[num2].delete(len-j - 1, len);
							work[num1].insert(0, move.toString());
							String nextstr = tostr(work);
							if(close.containsKey(nextstr) && close.get(nextstr) <= now.step + 1){
								continue;
							}
							open.add(new C(now.step + 1, work));
							close.put(nextstr, now.step + 1);
						}
					}
					else if(op1 == 'E' && op2 == 'W'){
						//from to
						for(int j = 0; j < now.list[num1].length(); j++){
							int len = now.list[num1].length();
							String temp = now.list[num1].substring(len - j - 1, len);
							StringBuilder move = new StringBuilder(temp);

							StringBuilder [] work = deepcopy(now.list);
							work[num1].delete(len-j - 1, len);
							work[num2].insert(0,move.toString());
							String nextstr = tostr(work);
							if(close.containsKey(nextstr) && close.get(nextstr) <= now.step + 1){
								continue;
							}
							open.add(new C(now.step + 1, work));
							close.put(nextstr, now.step + 1);
						}

						//to from
						for(int j = 0; j < now.list[num2].length(); j++){
							String temp = now.list[num2].substring(0, j+1);
							StringBuilder move = new StringBuilder(temp);

							StringBuilder [] work = deepcopy(now.list);
							work[num2].delete(0, j+1);
							work[num1].append(move.toString());
							String nextstr = tostr(work);
							if(close.containsKey(nextstr) && close.get(nextstr) <= now.step + 1){
								continue;
							}
							open.add(new C(now.step + 1, work));
							close.put(nextstr, now.step + 1);
						}
					}
					else{
						// E, E
						//from to
						for(int j = 0; j < now.list[num1].length(); j++){
							int len = now.list[num1].length();
							String temp = now.list[num1].substring(len - j-1, len);
							StringBuilder move = new StringBuilder(temp);
							move.reverse();

							StringBuilder [] work = deepcopy(now.list);
							work[num1].delete(len-j-1, len);
							work[num2].append(move.toString());
							String nextstr = tostr(work);
							if(close.containsKey(nextstr) && close.get(nextstr) <= now.step + 1){
								continue;
							}
							open.add(new C(now.step + 1, work));
							close.put(nextstr, now.step + 1);
						}

						//to from
						for(int j = 0; j < now.list[num2].length(); j++){
							int len = now.list[num2].length();
							String temp = now.list[num2].substring(len - j-1, len);
							StringBuilder move = new StringBuilder(temp);
							move.reverse();

							StringBuilder [] work = deepcopy(now.list);
							work[num2].delete(len-j - 1, len);
							work[num1].append(move.toString());
							String nextstr = tostr(work);
							if(close.containsKey(nextstr) && close.get(nextstr) <= now.step + 1){
								continue;
							}
							open.add(new C(now.step + 1, work));
							close.put(nextstr, now.step + 1);
						}
					} //ifend
				} //end i
			}//end while

			//答えが出ているなら出力
			if(ans!= -1){
				System.out.println(ans);
				continue;
			}

			//両側探索する
			LinkedList<C> open2 = new LinkedList<C>();
			StringBuilder [] openlist2 = new StringBuilder[x];
			for(int i = 0; i < x; i++){
				openlist2[i] = new StringBuilder(goal[i]);
			}
			open2.add(new C(0, openlist2));
			HashMap<String , Integer> close2 = new HashMap<String, Integer>();
			close2.put(tostr(openlist2), 0);
			while(! open2.isEmpty()){
				C now = open2.removeFirst();

				//ゴール判定
				String nowstr = tostr(now.list);
				if(close.containsKey(nowstr)){
					ans = now.step + close.get(nowstr);
					break;
				}

				for(int i = 0; i < y; i++){
					int num1 = data[i][0] - '0';
					int num2 = data[i][2] - '0';
					char op1 = data[i][1];
					char op2 = data[i][3];

					if(op1 == 'W' && op2 == 'W'){
						//from to
						for(int j = 0; j < now.list[num1].length(); j++){

							String temp = now.list[num1].substring(0, j + 1);
							StringBuilder move = new StringBuilder(temp);
							move.reverse();

							StringBuilder [] work = deepcopy(now.list);
							work[num1].delete(0, j + 1);
							work[num2].insert(0, move.toString());
							String nextstr = tostr(work);
							if(close2.containsKey(nextstr) && close2.get(nextstr) <= now.step + 1){
								continue;
							}
							open2.add(new C(now.step + 1, work));
							close2.put(nextstr, now.step + 1);
						}

						//to from
						for(int j = 0; j < now.list[num2].length(); j++){
							String temp = now.list[num2].substring(0, j + 1 );
							StringBuilder move = new StringBuilder(temp);
							move.reverse();

							StringBuilder [] work = deepcopy(now.list);
							work[num2].delete(0, j + 1);
							work[num1].insert(0, move.toString());
							String nextstr = tostr(work);
							if(close2.containsKey(nextstr) && close2.get(nextstr) <= now.step + 1){
								continue;
							}
							open2.add(new C(now.step + 1, work));
							close2.put(nextstr, now.step + 1);
						}
					}
					else if(op1 == 'W' && op2 == 'E'){
						//from to
						for(int j = 0; j < now.list[num1].length(); j++){
							String temp = now.list[num1].substring(0, j + 1);
							StringBuilder move = new StringBuilder(temp);

							StringBuilder [] work = deepcopy(now.list);
							work[num1].delete(0, j + 1);
							work[num2].append(move.toString());
							String nextstr = tostr(work);
							if(close2.containsKey(nextstr) && close2.get(nextstr) <= now.step + 1){
								continue;
							}
							open2.add(new C(now.step + 1, work));
							close2.put(nextstr, now.step + 1);
						}

						//to from
						for(int j =0; j < now.list[num2].length(); j++){
							int len = now.list[num2].length();
							String temp = now.list[num2].substring(len - j - 1, len);
							StringBuilder move = new StringBuilder(temp);

							StringBuilder [] work = deepcopy(now.list);
							work[num2].delete(len-j - 1, len);
							work[num1].insert(0, move.toString());
							String nextstr = tostr(work);
							if(close2.containsKey(nextstr) && close2.get(nextstr) <= now.step + 1){
								continue;
							}
							open2.add(new C(now.step + 1, work));
							close2.put(nextstr, now.step + 1);
						}
					}
					else if(op1 == 'E' && op2 == 'W'){
						//from to
						for(int j = 0; j < now.list[num1].length(); j++){
							int len = now.list[num1].length();
							String temp = now.list[num1].substring(len - j - 1, len);
							StringBuilder move = new StringBuilder(temp);

							StringBuilder [] work = deepcopy(now.list);
							work[num1].delete(len-j - 1, len);
							work[num2].insert(0,move.toString());
							String nextstr = tostr(work);
							if(close2.containsKey(nextstr) && close2.get(nextstr) <= now.step + 1){
								continue;
							}
							open2.add(new C(now.step + 1, work));
							close2.put(nextstr, now.step + 1);
						}

						//to from
						for(int j = 0; j < now.list[num2].length(); j++){
							String temp = now.list[num2].substring(0, j+1);
							StringBuilder move = new StringBuilder(temp);

							StringBuilder [] work = deepcopy(now.list);
							work[num2].delete(0, j+1);
							work[num1].append(move.toString());
							String nextstr = tostr(work);
							if(close2.containsKey(nextstr) && close2.get(nextstr) <= now.step + 1){
								continue;
							}
							open2.add(new C(now.step + 1, work));
							close2.put(nextstr, now.step + 1);
						}
					}
					else{
						// E, E
						//from to
						for(int j = 0; j < now.list[num1].length(); j++){
							int len = now.list[num1].length();
							String temp = now.list[num1].substring(len - j-1, len);
							StringBuilder move = new StringBuilder(temp);
							move.reverse();

							StringBuilder [] work = deepcopy(now.list);
							work[num1].delete(len-j-1, len);
							work[num2].append(move.toString());
							String nextstr = tostr(work);
							if(close2.containsKey(nextstr) && close2.get(nextstr) <= now.step + 1){
								continue;
							}
							open2.add(new C(now.step + 1, work));
							close2.put(nextstr, now.step + 1);
						}

						//to from
						for(int j = 0; j < now.list[num2].length(); j++){
							int len = now.list[num2].length();
							String temp = now.list[num2].substring(len - j-1, len);
							StringBuilder move = new StringBuilder(temp);
							move.reverse();

							StringBuilder [] work = deepcopy(now.list);
							work[num2].delete(len-j - 1, len);
							work[num1].append(move.toString());
							String nextstr = tostr(work);
							if(close2.containsKey(nextstr) && close2.get(nextstr) <= now.step + 1){
								continue;
							}
							open2.add(new C(now.step + 1, work));
							close2.put(nextstr, now.step + 1);
						}
					} //ifend
				} //end i
			}//end while

			//出力
			System.out.println(ans);
		}
		String a = "";
		for(int i = 0; i < a.length(); i++){
			System.out.println(a.substring(0, i + 1));

		}
	}

	private StringBuilder[] deepcopy(StringBuilder[] list) {
		StringBuilder [] sb = new StringBuilder[list.length];
		for(int i = 0; i < list.length; i++){
			sb[i] = new StringBuilder(list[i].toString());
		}
		return sb;
	}

	private String tostr2(String[] goal) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < goal.length; i++){
			sb.append(goal[i].toString() + ".");
		}
		return sb.toString();
	}

	private String tostr(StringBuilder[] openlist) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < openlist.length; i++){
			sb.append(openlist[i].toString() + ".");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}