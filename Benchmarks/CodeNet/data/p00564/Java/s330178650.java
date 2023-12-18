import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str;
            while ((str = br.readLine()) != null) {
                String[] num = str.split(" ");
                int X = Integer.parseInt(num[0]);
                int A = Integer.parseInt(num[1]);
                int B = Integer.parseInt(num[2]);
                int C = Integer.parseInt(num[3]);
                int D = Integer.parseInt(num[4]);
                int PriceA, PriceB;
                if (X % A == 0) {
                	PriceA = B * (X / A);
                } else {
                	PriceA = B * ((X / A) + 1);
                }
                if (X % C == 0) {
                	PriceB = D * (X / C);
                } else {
                	PriceB = D * ((X / C) + 1);
                }
                System.out.println(Math.min(PriceA, PriceB));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
	}

}

