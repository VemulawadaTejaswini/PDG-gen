import java.util.*;

public class Main {
	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int n = Integer.parseInt(sc.nextLine().trim());
			if (n == 0) {
				break;
			}
			
			Map<String, String> replaceMap = new HashMap<String, String>();
			for (int i = 0; i < n; i++) {
				String[] input = sc.nextLine().split(" ");
				replaceMap.put(input[0].trim(), input[1].trim());
			}
			
			n = Integer.parseInt(sc.nextLine().trim());
			String[][] inputStrArray = new String[n][2];
			for (int j = 0; j < n; j++) {
				inputStrArray[j][0] = sc.nextLine().trim();
				inputStrArray[j][1] = "false";
			}
			
			for (int j = 0; j < n; j++) {
				if (!Boolean.valueOf(inputStrArray[j][1]) && replaceMap.containsKey(inputStrArray[j][0])) {
					inputStrArray[j][0] = replaceMap.get(inputStrArray[j][0]);
					inputStrArray[j][1] = "true";
				}
			}
			
			for (int k = 0; k < n; k++) {
				System.out.print(inputStrArray[k][0]);
			}
			System.out.println("");
		}
	}
}