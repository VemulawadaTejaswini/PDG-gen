import java.io.*;

public class Main {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		
		try {
			String str = reader.readLine();
			int N = Integer.parseInt(str);
			
			int sum_so = 0;
			
			if(N < 105) {
				System.out.println(0);
			} else {
				for(int i = 0; (i + 105) <= N; i +=2) {
					double kisu = i + 105;
					int count3 = 0;
					int count5 = 0;
					int count7 = 0;
					int count11 = 0;
					int count13 = 0;
					int sum = 0;
					
					while((kisu % 3) == 0) {
						count3++;
						kisu /= 3;
					}
					while((kisu % 5) == 0) {
						count5++;
						kisu /= 5;
					}
					while((kisu % 7) == 0) {
						count7++;
						kisu /= 7;
					}
					while((kisu % 11) == 0) {
						count11++;
						kisu /= 11;
					}
					while((kisu % 13) == 0) {
						count13++;
						kisu /= 13;
					}
					sum = (count3 + 1) * (count5 + 1) * (count7 + 1) * (count11 + 1) * (count13 + 1);
					if(sum == 8) {
						sum_so++;
					}
					
				}
				System.out.println(sum_so);
			}
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
