import java.io.*;
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String input = br.readLine();
			String[] score = input.split(" ");
			Integer m = Integer.parseInt(score[0]);
			Integer f = Integer.parseInt(score[1]);
			Integer r = Integer.parseInt(score[2]);
			Integer total = m + f;
			if(m == -1 && f == -1 && r == -1){
				break;
			}
			if(m == -1 || f == -1){
				System.out.println("F");
			}
			else if(total >= 80){
				System.out.println("A");
			}
			else if(total >= 65 && total < 80){
				System.out.println("B");
			}
			else if(total >= 50 && total < 65){
				System.out.println("C");
			}
			else if(total >= 30 && total < 50){
				if(r >= 50){
					System.out.println("C");
				}
				else{
					System.out.println("D");
				}
			}
			else if(total < 30){
				System.out.println("F");
			}
		}
	}
}