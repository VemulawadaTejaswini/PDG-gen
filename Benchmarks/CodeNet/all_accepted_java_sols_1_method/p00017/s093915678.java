import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {

			String inputData = sc.nextLine();
			

				int count = 1;

				for (int i = 0; i < 27; i++) {
					StringBuilder sb = new StringBuilder();
					
					for (int j = 0; j < inputData.length(); j++) {
						char c = inputData.charAt(j);
						
						if((int)c <= 127 && (int)c >= 92) {
						c = (char) ((int) c + count);

						if (c > 122) {
							c = (char) ((c - 122) + 96);
						} else if (c < 97) {
							c = (char) (123 - (97 - c));
						}
						
						}

						sb.append(c);
					}
					
					String aaa = sb.toString();
					String a = "this";
					String b = "that";
					String c = "the";
					
					if (aaa.matches(".*" + a  + ".*") || aaa.matches(".*" + b  + ".*") ||aaa.matches(".*" + c  + ".*")) {
						System.out.println(sb);
						break;
					}
					
					count++;
					
				}
				
				
			
		}
	}

}