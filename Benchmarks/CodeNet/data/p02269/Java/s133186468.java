import java.util.Scanner;


public class Main{

	// 要素数は素数を設定
	public static String[] hashTable = new String[100001];

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int cnt = new Integer(s.nextLine()).intValue();
		for(int i=0 ; i<cnt ; i++) {
			String[] inputData = s.nextLine().split(" ");
			if("insert".equals(inputData[0])) {
				insert(inputData[1]);
			}else {
				find(inputData[1]);
			}
		}
	}

	public static void insert(String value) {
		int hashValue = hashFunction(value);
		// 衝突しない場合、そのまま配列に格納する
		if(hashTable[hashValue] == null || hashTable[hashValue] == "") {
			hashTable[hashValue] = value;
		}
		// 衝突する場合、ハッシュコードに「衝突回数*3」を加算して再ハッシュする
		else {
			aaa :for(int i=1 ; ; i++) {
				hashValue += 1;
				int reHash = hashValue % 100001;
				// リハッシュした場所に格納できる場合、格納して処理を抜ける
				if(hashTable[reHash] == null || hashTable[reHash] == "") {
					hashTable[reHash] = value;
					break aaa;
				}else if(value.equals(hashTable[reHash]))
					break aaa;
				else if(i == 501)
					break aaa;
			}
		}
	}

	public static void find(String value) {
		int hashValue = hashFunction(value);
		if(value.equals(hashTable[hashValue])) {
			System.out.println("yes");
		}else {
			bbb :for(int i=1 ; ; i++) {
				hashValue += 1;
				int reHash = hashValue % 100001;
				if(value.equals(hashTable[reHash])) {
					System.out.println("yes");
					break bbb;
				}
				if(hashTable[reHash] == null) {
					System.out.println("no");
					break bbb;
				}
			}
		}
	}


	public static int hashFunction(String value) {
		int v = 0;
		int p = 5;
		for(int i=0 ; i<value.length() ; i++) {
			if("A".equals(value.substring(i, i+1))) {
				v += 3 * p;
			}else if("C".equals(value.substring(i, i+1))) {
				v += 4 * p;
			}else if("G".equals(value.substring(i, i+1))) {
				v += 5 * p;
			}else if("T".equals(value.substring(i, i+1))) {
				v += 6 * p;
			}
			p *= 5;
		}
		return v % 100001;
	}
}