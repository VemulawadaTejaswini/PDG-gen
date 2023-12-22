import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int n= Integer.parseInt(sc.next());
		//System.out.println(n);


		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


			String line = br.readLine();


			//String[] strs = line.split(" ");//区切りで変える

			int N = Integer.parseInt(line);
			String[] array = new String[3];

			for(int i = 0;i<array.length;i++) {
				array[i] = br.readLine();
			}

			int ans_count = 0;
			for(int i = 0;i<N;i++) {
				char a = array[0].charAt(i);
				char b = array[1].charAt(i);
				char c = array[2].charAt(i);

				int temp = 0;

				if(a==b) {
					temp++;
				}
				if(b==c) {
					temp++;
				}
				if(a==c) {
					temp++;
				}

				switch(temp) {
				case 0:
					ans_count +=2;
					break;
				case 1:
				case 2:
					ans_count++;
					break;
				case 3:
					break;

				}


			}

			System.out.println(ans_count);


		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}


	}

}
