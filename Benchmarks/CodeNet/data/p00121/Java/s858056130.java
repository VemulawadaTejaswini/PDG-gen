import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
//import java.util.TreeSet;

public class Main {

	/**
	 * @param args
	 */
//	public static final int INF = Integer.MAX_VALUE;
//	public static final int FAIL = INF;
	public static final String ANS ="01234567";
	//盤面の状態を保持
	public static ArrayList<String> list = new ArrayList<String>();
	public static TreeSet<String> map = new TreeSet<String>();
	public static void main(String[] args) {
		doIt();
		//main(args);
	}

	public static void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String start = "";
			list.clear();
			map.clear();
			for(int i = 0; i < 8; i++){
				start += sc.next();
			}
			if(check(start)){
				System.out.println(0);
				continue;
			}
			list.add(start);
			boolean bOK = false;
			int i = 0;
			int res = 0;
			while(bOK == false){
				res++;
				int size = list.size(); 
				while(i < size){
					bOK |= search(list.get(i));
					i++;
					if(bOK){
						break;
					}
				}
			}
			System.out.println(res);
		}
	}
	
	public static boolean check(String t){
		if(t.equals(ANS)){
			return true;
		}
		if(map.contains(t) == false){
			//System.out.println(t);
			map.add(t);
			list.add(t);
		}
		return false;
	}

	public static boolean search(String s){
		int zero = s.indexOf('0');
		boolean bEnd = false;

		switch(zero){
		case 0:
			bEnd |= check(exchange(s,0,1));
			bEnd |= check(exchange(s,0,4));
			break;
		case 1:
			bEnd |= check(exchange(s,1,0));
			bEnd |= check(exchange(s,1,2));
			bEnd |= check(exchange(s,1,5));
			break;
		case 2:
			bEnd |= check(exchange(s,2,1));
			bEnd |= check(exchange(s,2,3));
			bEnd |= check(exchange(s,2,6));
			break;
		case 3:
			bEnd |= check(exchange(s,3,2));
			bEnd |= check(exchange(s,3,7));
			break;
		case 4:
			bEnd |= check(exchange(s,4,0));
			bEnd |= check(exchange(s,4,5));
			break;
		case 5:
			bEnd |= check(exchange(s,5,4));
			bEnd |= check(exchange(s,5,6));
			bEnd |= check(exchange(s,5,1));
			break;
		case 6:
			bEnd |= check(exchange(s,6,5));
			bEnd |= check(exchange(s,6,7));
			bEnd |= check(exchange(s,6,2));
			break;
		case 7:
			bEnd |= check(exchange(s,7,6));
			bEnd |= check(exchange(s,7,3));
			break;
		}
		return bEnd;
	}

	public static String exchange(String s, int n1, int n2){
		char c1 = s.charAt(n1);
		char c2 = s.charAt(n2);
		//
		String t = s.replace(c1, 'a');
		t = t.replace(c2, c1);
		t = t.replace('a', c2);
		return t;
	}

}