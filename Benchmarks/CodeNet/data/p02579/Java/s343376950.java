import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Main {

	static BufferedReader reader;
	final static boolean MODE_DEBUG = false;
	static int[] read_line_int;
	static int read_line_int_ptr;
	static long[] read_line_long;
	static int read_line_long_ptr;
	static String[] read_line;
	static int read_line_ptr;
	//static field here
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		//code here
		int H = readInt();
		int W = readInt();
		int Ch = readInt()-1;
		int Cw = readInt()-1;
		int Dh = readInt()-1;
		int Dw = readInt()-1;
		int[][] map = new int[H][];
		for(int h=0;h<H;h++) {
			map[h] = new int[W];
			char[] cs = readLine()[0].toCharArray();
			for(int w=0;w<W;w++) {
				map[h][w] = cs[w]=='#'?-2:Integer.MAX_VALUE;
			}
		}
		Integer[][] poses = new Integer[W][H];
		for(int h=0;h<H;h++) {
			for(int w=0;w<W;w++) {
				poses[w][h] = w*H+h;
			}
		}
		int ptr = 0;
		int seccnt = 0;
		int maxsize = 1;
		int nowsize = 1;
		ArrayList<LinkedHashSet<Integer>> frs = new ArrayList<>();
		LinkedHashSet<Integer> frt = new LinkedHashSet<>();
		frs.add(frt);
		frt.add(poses[Cw][Ch]);
		map[Ch][Cw]=0;
		for(int num=0;num<frs.size();num++) {
			LinkedHashSet<Integer> fr = frs.get(num);
			while(!fr.isEmpty()) {
				int p = fr.iterator().next();
				int X = p/H;
				int Y = p%H;
				fr.remove(p);
				nowsize--;
				int nowscore = map[Y][X];
				boolean xp = false;
				boolean xm = false;
				boolean yp = false;
				boolean ym = false;
				if(X>0) {
					if(map[Y][X-1]!=-2&&map[Y][X-1]>nowscore) {
						map[Y][X-1] = nowscore;
						fr.add(poses[X-1][Y]);
						nowsize++;
						xm=true;
					}
				}
				if(Y>0) {
					if(map[Y-1][X]!=-2&&map[Y-1][X]>nowscore) {
						map[Y-1][X] = nowscore;
						fr.add(poses[X][Y-1]);
						nowsize++;
						ym=true;
					}
				}
				if(X<W-1) {
					if(map[Y][X+1]!=-2&&map[Y][X+1]>nowscore) {
						map[Y][X+1] = nowscore;
						fr.add(poses[X+1][Y]);
						nowsize++;
						xp=true;
					}
				}
				if(Y<H-1) {
					if(map[Y+1][X]!=-2&&map[Y+1][X]>nowscore) {
						map[Y+1][X] = nowscore;
						fr.add(poses[X][Y+1]);
						nowsize++;
						yp=true;
					}
				}
				for(int x=xm?X:Math.max(0,X-2);x<=(xp?X:Math.min(W-1,X+2));x++) {
					for(int y=ym?Y:Math.max(0,Y-2);y<=(yp?Y:Math.min(H-1,Y+2));y++) {
						if(map[y][x]!=-2&&map[y][x]>nowscore+1) {
							map[y][x] = nowscore+1;
							if(frs.size()<=nowscore+1) {
								frs.add(new LinkedHashSet<>());
							}
							frs.get(nowscore+1).add(poses[x][y]);
							nowsize++;
						}
					}
				}
				
				maxsize = Math.max(maxsize,nowsize);
				//print(fr.size());
				/*for(int y=0;y<H;y++) {
					StringBuilder sb = new StringBuilder();
					for(int x=0;x<W;x++) {
						if(map[y][x]==Integer.MAX_VALUE) {
							sb.append("?? ");
						}else if(map[y][x]==-2) {
							sb.append("xx ");
						}else {
							sb.append(map[y][x]+" ");
						}
					}
					for(int x=0;x<W;x++) {
						if(fr.contains(x*H+y)) {
							sb.append("o ");
						}else{
							sb.append("x ");
						}
					}
					print(sb.toString());
				}
				print("");*/
			}
		}
		if(map[Dh][Dw]>=0&&map[Dh][Dw]!=Integer.MAX_VALUE) {
			print(map[Dh][Dw]);
		}else {
			print("-1");
		}
		//print(maxsize);
	}
	
	//functions here
	//note that all methods should be STATIC


	private static <T> int arraySearch(T needle, T[] heystack) {
		for(int i=0;i<heystack.length;i++) {
			if(needle.equals(heystack[i])) {
				return i;
			}
		}
		return -1;
	}
	private static int[] sort(int[] base) {
		int[] copy = array_copy(base);
		Arrays.sort(copy);
		return copy;
	}
	private static int[] array_copy(int[] base) {
		int[] copy = new int[base.length];
		for(int i=0;i<base.length;i++) {
			copy[i] = base[i];
		}
		return copy;
	}
	private static int[] asArray(ArrayList<Integer> ints) {
		int[] intlist = new int[ints.size()];
		for(int i=0;i<intlist.length;i++) {
			intlist[i] = ints.get(i);
		}
		return intlist;
	}
	private static int readInt() {
		if(read_line_int==null||read_line_int_ptr==read_line_int.length) {
			read_line_int = readLineInt();
			read_line_int_ptr=0;
		}
		return read_line_int[read_line_int_ptr++];
	}
	private static long readLong() {
		if(read_line_long==null||read_line_long_ptr==read_line_long.length) {
			read_line_long = readLineLong();
			read_line_long_ptr=0;
		}
		return read_line_long[read_line_long_ptr++];
	}
	private static String readString() {
		if(read_line==null||read_line_int_ptr==read_line.length) {
			read_line = readLine();
			read_line_ptr=0;
		}
		return read_line[read_line_ptr++];
	}
	private static String[] readLine(){
		try{
			return reader.readLine().split(" ");
		}catch(Exception e){
			e.printStackTrace();
			return new String[]{e.getMessage()};
		}
	}
	private static int[] readLineInt(){
		try{
			String[] s = readLine();
			int[] ints = new int[s.length];
			for(int i=0;i<ints.length;i++) {
				ints[i] = Integer.parseInt(s[i]);
			}
			return ints;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static long[] readLineLong(){
		try{
			String[] s = readLine();
			long[] ints = new long[s.length];
			for(int i=0;i<ints.length;i++) {
				ints[i] = Long.parseLong(s[i]);
			}
			return ints;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static byte[] readLineByte(){
		try{
			String[] s = readLine();
			byte[] bytes = new byte[s.length];
			for(int i=0;i<bytes.length;i++) {
				bytes[i] = Byte.parseByte(s[i]);
			}
			return bytes;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static char[] readLineChar(){
		try{
			String[] s = readLine();
			char[] chars = new char[s.length];
			for(int i=0;i<chars.length;i++) {
				chars[i] = (char)Integer.parseInt(s[i]);
			}
			return chars;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	private static void print(Object o){
		System.out.println(o);
	}
	private static void print(){
		System.out.println();
	}
	private static void printd(Object o){
		if(MODE_DEBUG)System.err.println(o);
	}
	private static void printd(){
		if(MODE_DEBUG)System.err.println();
	}
}
