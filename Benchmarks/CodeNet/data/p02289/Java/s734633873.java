import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static final long HUGE_NUM = 99999999999999999L;
	public static final double EPS = 0.000000001;

	public static final int SIZE = 2000005;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			PQ Q = new PQ(SIZE);

			String input_str = "";
			String tmp_str[] = new String[2];

			StringBuilder ans = new StringBuilder();

			while(!(input_str = br.readLine()).equals("end")){

				tmp_str = input_str.split("\\s+");

				//空の場合と満杯の場合の出力は設問で未定義なのでチェックしない
				if(tmp_str[0].equals("insert")){

					Q.push(Integer.parseInt(tmp_str[1]));

				}else{

					ans.append(Integer.toString(Q.pop())).append("\n");
				}
			}

			System.out.print(ans.toString());

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
    }
}

class PQ{

	public int table[];
	public int num_nodes;
	public final int root = 0;
	public final int NONE = -1;

	PQ(int arg_size){

		table = new int[arg_size];

		for(int i = 0; i < table.length; i++){

			table[i] = NONE;
		}

		num_nodes = 0;
	}

	public void push(int value){

		table[num_nodes] = value;
		int loc = num_nodes++;
		int parent = -1,tmp = 0;

		//親が今回挿入するデータより小さい場合、親と子を入れ替える
		while(loc != root){
			parent = (loc-1)/2;
			if(table[parent] >= table[loc]){

				break;
			}else{

				tmp = table[parent];
				table[parent] = table[loc];
				table[loc] = tmp;
				loc = parent;
			}
		}
	}

	public boolean isEmpty(){

		return num_nodes == 0;
	}

	public boolean isFull(){

		return num_nodes == table.length;
	}

	public int pop(){

		int ret = table[root];

		//とりあえず末尾のデータをtopに持ってくる
		num_nodes--;
		table[root] = table[num_nodes];
		table[num_nodes] = NONE;

		int loc = root;
		int left = 0,right = 0;
		int tmp = 0;

		//親子の大小関係が正しくなるようにする
		while(true){

			left = 2*loc+1;
			if(left >= table.length)break; //一番下の層

			right = 2*loc+2;

			if(table[loc] >= table[left] && table[loc] >= table[right]){ //親 >= 左右の子

				break;
			}else{ //少なくとも一方の子が親よりも大きい→左と右で大きい方の子と交換する

				if(table[left] >= table[right]){

					tmp = table[loc];
					table[loc] = table[left];
					table[left] = tmp;
					loc = left;

				}else{// table[left] < table[right]

					tmp = table[loc];
					table[loc] = table[right];
					table[right] = tmp;
					loc = right;
				}
			}
		}

		return ret;
	}
}

class UTIL{

    //String→intへ変換
    public static int getNUM(String tmp_str){

        return Integer.parseInt(tmp_str);
    }

    //文字が半角数字か判定する関数
    public static boolean isNumber(String tmp_str){

        if(tmp_str == null || tmp_str.length() == 0){

            return false;
        }

        Pattern pattern = Pattern.compile("\\A[0-9]+\\z");
        Matcher matcher = pattern.matcher(tmp_str);
        return matcher.matches();
    }
}
