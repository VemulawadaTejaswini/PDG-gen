import java.util.*;
import java.lang.Math;

class doubleHash {
	
	String[] hashTable;
	private static final int TABLE_SIZE = 1250003; //1250003 ????´???°
	
	doubleHash(){
		hashTable = new String[TABLE_SIZE];
	}
	
	public boolean insert(String s){
		int h = makeHash(s);
		for (int i = 0; i < TABLE_SIZE; i++,h = reHash(h)){
			if(hashTable[h] == null) {
				hashTable[h] = s;
				return true;
			}
		}
		return false;
	}

	public boolean find(String s){
		int h = makeHash(s);
		for (int i = 0; i < TABLE_SIZE; i++,h = reHash(h)){
			if(hashTable[h] == null) {
				return false;
			}else if(hashTable[h].equals(s)) {
				return true;
			}
		}
		return false;
	}
	
	private int makeHash(String s){
		long index = 0;
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			int a = 0;
			int weight = (int)Math.pow(5,(i % 7));
			switch (c){
				case 'A': a = 1;
				case 'C': a = 2;
				case 'G': a = 3;
				case 'T': a = 4;
			}
			index = (index + a * weight) % TABLE_SIZE;
		}
		return (int)index;
	}
	
	private int reHash(int index){
		return (index * 7 ) % TABLE_SIZE;
	}
}

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		doubleHash table = new doubleHash();
		ArrayList<String> ar = new ArrayList<String>();
		
		String command;
		for(int i = 0; i < n; i++){
			command = sc.next();
			if(command.equals("insert")){
				table.insert(sc.next());
			}else if (command.equals("find")){
				boolean ret = table.find(sc.next());
				if (ret){
					ar.add("yes");
				} else {
					ar.add("no");
				}
			}
		}
		for (String result : ar) {
			System.out.println(result);
		}
	}
}