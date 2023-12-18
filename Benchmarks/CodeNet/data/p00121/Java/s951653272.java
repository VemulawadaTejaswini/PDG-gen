import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static Queue<String> queue=new LinkedList<>();
	//static int[] c;
	static Map<String, Integer> map=new HashMap<>();
	static String str;
	static int[][] d= {{0, 1, 4}, {-1, 1, 4}, {-1, 1, 4}, {-1, 0, 4}, {0, 1, -4}, {-1, 1, -4}, {-1, 1, -4}, {-1, 0, -4}};
	
	
	static void bfs() {
		while(! queue.isEmpty()) {
			String str1=queue.remove();
			//int point=c[Integer.parseInt(str1)];
			int point = map.get(str1);
			//System.out.println("str1="+str1+" point:"+point);
			String str2="";
//			if(str1.equals(str)) {
//				queue.clear();
//				break;
//			}
			for(int i=0; i<8; i++) {
				if(str1.charAt(i)=='0') {
					for(int j=0; j<3; j++) {
						//System.out.println(i+" "+(i+d[i][j]));
						char change=str1.charAt(i+d[i][j]);
						str2=str1.replace('0', '9');
						str2=str2.replace(change, '0');
						str2=str2.replace('9', change);
						//if(c[Integer.parseInt(str2)]==0) {
						if(map.get(str2)==null) {
							//c[Integer.parseInt(str2)]=point+1;
							map.put(str2, point+1);
							queue.add(str2);
						}
					}
					break;
				}
			}
		}
	}
	
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			queue.add("01234567");
			map.put("01234567", 0);
			//c[Integer.parseInt("01234567")]=0;
			bfs();
			while(sc.hasNext()) {
				String s=sc.nextLine();
				String[] token=s.split(" ");
				str="";
				//c=new int[76543211];
				for(String t:token) {
					str+=t;
				}
				//System.out.println(c[Integer.parseInt(str)]);
				System.out.println(map.get(str));
			}
			
		}
	}
}
