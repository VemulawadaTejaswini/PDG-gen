import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String str = reader.readLine();
		int N = Integer.parseInt(str);

		int A[] = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = 0;
		}
		
		String a = reader.readLine();//行を読み込む
      	String[] data = a.split(" ");//スペース区切りで配列に格納
		for (int i = 0; i < N - 1; i++) {
			int count = Integer.parseInt(data[i]);//dataのi番目をintに変換
			A[count - 1]++;
		}

		for (int i = 0; i < N; i++) {
			System.out.println(A[i]);
        }
    }
}
