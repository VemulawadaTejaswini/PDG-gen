import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);

		for(int i=0; i<2; i++){
			int bottle[] = {0,0};
			int balls[] = new int[10];
			str = br.readLine();
			String strArray[] = str.split(" ");
			boolean flag = true;
			boolean s = true;

			initialize(strArray, balls);
			Input(balls, bottle);

		}


	}

	static void s(boolean f){
		f = false;
	}

	static void initialize(String str[], int n[]){
		for(int i=0; i<10; i++){
			n[i] = Integer.parseInt(str[i]);
		}
	}

	static void Input(int n[], int b[]){
		boolean judge = true;
		for(int i=0; i<n.length; i++){
			if(b[0] < n[i]){
				b[0] = n[i];
			}else if(b[1] < n[i]){
				b[1] = n[i];
			}else{
				judge = false;
				break;
			}
		}
		System.out.println(judge ? "YES" : "NO");
	}

}