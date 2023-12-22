import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		// 1行目数字
		int iCount = Integer.parseInt(br.readLine());

		// 2行目、複数数字
		String[] ss0 = br.readLine().trim().split(" ", 0);

				
				// 3行目以降、複数数字
				for(int i = 0; i < iCount; i++){
					//System.out.print("[" + ss0[i] + "]");
				}
				//System.out.println("");
				

		int n = 0;
		int m = 0;
		int iAns = 0;
		for(int i = 0; i < iCount; i++){
			n = Integer.parseInt(ss0[i]);
					//System.out.print("n=[" + n + "]");
			m = Integer.parseInt(ss0[n-1]);
			if (m == (i+1)) { iAns++; }
					//System.out.println("ss0[n-1]=[" + ss0[n-1] + "], i=[" + i + "], iAns=[" + iAns + "]");
		}

		System.out.print(iAns/2);
    }
}

