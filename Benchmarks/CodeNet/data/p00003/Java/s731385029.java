import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Isitsarighttriangle {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String f = br.readLine();
		int[][] a = new int[Integer.parseInt(f)][3];
		for(int i = 0 ; i < Integer.parseInt(f) ; i++){
			String str = br.readLine();
			String[] stra = str.split(" ");
			a[i][0] = Integer.parseInt(stra[0]);
			a[i][1] = Integer.parseInt(stra[1]);
			a[i][2] = Integer.parseInt(stra[2]);
			if(a[i][0]*a[i][0]+a[i][1]*a[i][1]==a[i][2]*a[i][2]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}

	}

}