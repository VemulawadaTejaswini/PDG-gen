import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());

		int W=Integer.parseInt(st.nextToken());
		int H=Integer.parseInt(st.nextToken());
		int x=Integer.parseInt(st.nextToken());
		int y=Integer.parseInt(st.nextToken());
		int r=Integer.parseInt(st.nextToken());

		int maxx=W-r;
		int maxy=H-r;

		//判定を行う処理
		if(r<=x && x<=maxx && r<=y && y<=maxy) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
