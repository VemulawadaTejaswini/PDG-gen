import java.util.*;
//SHAKYO
public class Main {
	private void doit(){
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> list = new HashMap<String, Integer>();
		int length= 0,count=0;
		String countStr="", lenStr="";
		while(sc.hasNext()){
			String str = sc.next();
			if(list.containsKey(str)){
				list.put(str, list.get(str) + 1);
			}
			else{
				list.put(str, 1);
			}
			int value = list.get(str);
			if(value > count){
				count = value;
				countStr = str;
			}
			int nowlen = str.length();
			if(nowlen > length){
				length = nowlen;
				lenStr = str;
			}
		}
		System.out.println(countStr + " " + lenStr);
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}