import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static final int TABLESIZE = 1000003;

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		 int n = readInt(r);

		 String[] table = new String[TABLESIZE];

		 for(int i = 0 ; i < n ; i++){
			 excute(r.readLine().split(" "),table);
		 }

	}

	public static void excute(String[] comAndStr,String[] table){
		String command = comAndStr[0];
		String str = comAndStr[1];

		if("insert".equals(command)){
			insert(str,table);
		}else{
			if(find(str,table)){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
	}

	public static void insert(String str,String[] table){
		int i = 0;
		int hash;
		while(true){
			hash = makeHash(str, i);
			if(table[hash] == null){
				table[hash] = str;
				break;
			}else{

			}
			i++;
		}

	}

	public static boolean find(String str,String[] table){
		int i = 0;
		int hash;
		while(true){
			hash = makeHash(str, i);
			if(table[hash] == null || i >= TABLESIZE){
				return false;
			}else if(table[hash].equals(str)){
				return true;
			}
			i++;
		}
	}

	public static int makeHash(String str,int i){
		int num = strToNum(str);
		if(i == 0){
			return h1(num);
		}else{
            return h2(num,i);
		}
	}

	public static int strToNum(String str){
		int num = 0;
		int p = 1;
		for(int i = 0 ; i < str.length(); i++){
			num += p * (int)str.charAt(i);
			p += 2;
		}

		return num;
	}

	public static int h1(int num){
		return num % TABLESIZE;
	}

	public static int h2(int num,int i){
		return (h1(num) + i * (1 + (num % (TABLESIZE - 1)))) % TABLESIZE;
	}

	public static int readInt(BufferedReader r) throws Exception{
        return Integer.parseInt(r.readLine());
    }

}