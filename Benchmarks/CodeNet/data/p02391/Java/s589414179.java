
package solved.judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SolvedJudge {
    public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


                int a =3;
                int b =4;
//	        a = Integer.parseInt(br.readLine());
//		b = Integer.parseInt(br.readLine());

		if(a<b)
			System.out.print("a < b");
		else if(a>b)
			System.out.print("a > b");
		else if(a==b)
			System.out.print("a == b");

		
    }
}