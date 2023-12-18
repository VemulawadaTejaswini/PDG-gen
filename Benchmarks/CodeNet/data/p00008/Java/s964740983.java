import java.io.BufferedReader;
import java.io.InputStreamReader;

// ÜèÉàüµ­È¢¦BvÄl
//public class Problem0008_SumOf4Integers {
public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line;
			
			while((line = reader.readLine()) != null) {
				int number = Integer.parseInt(line);
				int result = 0;
				for(int i = 0; i < 10; i++) {
					if(0 < number - i && number - i < 28) {
						for(int j = 0; j < 10; j++) {
							if(0 < number - i -j && number - i - j < 19) {
								for(int k = 0; k < 10; k++) {
									if(0 < number -i -j -k && number -i -j -k < 10) {
										result++;
									}
								}
							}
						}
					}
				}
				System.out.println(result);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}