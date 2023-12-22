import java.io.*;
public class Main {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			for (int i = 1; i <= n; i++) {
				if (i % 3 == 0) {
					System.out.print(" " + i);
				} else {
					int x = i;
					int y = i;
					int b = 0;
					while (x != 0) {
						x = x % 10;
						if (x == 3) {
							b++;
							break;
						}
						y = y / 10;
						x = y;
					}
					if (b > 0) {
						System.out.print(" " + i);
					}
					
				}
			}
			System.out.println();
		} catch (IOException e) {
          System.out.println(e);
        } catch (NumberFormatException e) {
          System.out.println("error");
        }
    }
}