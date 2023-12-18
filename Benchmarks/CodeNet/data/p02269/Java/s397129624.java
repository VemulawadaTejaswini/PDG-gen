import java.util.Scanner;


public class Main {

	public static final int TABLESIZE = 1000003;
	static String[] table = new String[TABLESIZE];

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		String cmd,str;

		for(int i = 0 ; i < n ; i++){
			cmd = scan.next();
			str = scan.next();

			if("insert".equals(cmd)){
				insert(str);
			}else{
				if(find(str)){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
			}
		}
	}

	public static void insert(String str){
		int i = 0;
		int hash;
		while(i < TABLESIZE){
			hash = makeHash(str,i);
			if(table[hash] == null){
				table[hash] = str;
				return;
			}
			i++;
		}
	}

	public static boolean find(String str){
		int i = 0;
		int hash;
		while(i < TABLESIZE){
			hash = makeHash(str,i);
			if(str.equals(table[hash])){
				return true;
			}else if(table[hash] == null){
				return false;
			}
			i++;
		}

		return false;

	}

	public static int makeHash(String str,int i){
		int key = getKey(str);
		return (h1(key) + i * h2(key)) % TABLESIZE;
	}

	public static int getKey(String str){
		int key = 0;
		int x = 1;
		for(int i = 0 ; i < str.length() ; i++){
			key += x * getChar(str.charAt(i));
			x += 7;
		}
		return key;
	}

	public static int getChar(char c){
		if('A' == c){
			return 1;
		}else if('C' == c){
			return 2;
		}else if('G' == c){
			return 3;
		}else{
			return 4;
		}
	}

	public static int h1(int key){
		return key % TABLESIZE;
	}

	public static int h2(int key){
		return 1 + (key % (TABLESIZE - 1));
	}
}