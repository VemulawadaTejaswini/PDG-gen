

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);
		// ?????¢?????????????????????????????°???????´?????????????
		int[] char_count = new int[26];

		while(in.hasNextLine()){

			String str = in.nextLine();

			if(str.length() == 0){
			//if(str.equals("")){

				break;

			}else{

				// ???????????¨????°????????????????
				String lower_case = str.toLowerCase();


				// ???????????????????????????
				for (int i = 0; i < lower_case.length(); i++) {

					int array_number = 0;

					for(char a = 'a'; a <= 'z'; a++) {

						if(lower_case.charAt(i) == a){

							char_count[array_number]++;

							break;

						}

						array_number++;

					}

					/*if(lower_case.charAt(i) == 'a'){

						char_count[0]++;

					}else if(lower_case.charAt(i) == 'b'){

						char_count[1]++;

					}else if(lower_case.charAt(i) == 'c'){

						char_count[2]++;

					}else if(lower_case.charAt(i) == 'd'){

						char_count[3]++;

					}else if(lower_case.charAt(i) == 'e'){

						char_count[4]++;

					}else if(lower_case.charAt(i) == 'f'){

						char_count[5]++;

					}else if(lower_case.charAt(i) == 'g'){

						char_count[6]++;

					}else if(lower_case.charAt(i) == 'h'){

						char_count[7]++;

					}else if(lower_case.charAt(i) == 'i'){

						char_count[8]++;

					}else if(lower_case.charAt(i) == 'j'){

						char_count[9]++;

					}else if(lower_case.charAt(i) == 'k'){

						char_count[10]++;

					}else if(lower_case.charAt(i) == 'l'){

						char_count[11]++;

					}else if(lower_case.charAt(i) == 'm'){

						char_count[12]++;

					}else if(lower_case.charAt(i) == 'n'){

						char_count[13]++;

					}else if(lower_case.charAt(i) == 'o'){

						char_count[14]++;

					}else if(lower_case.charAt(i) == 'p'){

						char_count[15]++;

					}else if(lower_case.charAt(i) == 'q'){

						char_count[16]++;

					}else if(lower_case.charAt(i) == 'r'){

						char_count[17]++;

					}else if(lower_case.charAt(i) == 's'){

						char_count[18]++;

					}else if(lower_case.charAt(i) == 't'){

						char_count[19]++;

					}else if(lower_case.charAt(i) == 'u'){

						char_count[20]++;

					}else if(lower_case.charAt(i) == 'v'){

						char_count[21]++;

					}else if(lower_case.charAt(i) == 'w'){

						char_count[22]++;

					}else if(lower_case.charAt(i) == 'x'){

						char_count[23]++;

					}else if(lower_case.charAt(i) == 'y'){

						char_count[24]++;

					}else if(lower_case.charAt(i) == 'z'){

						char_count[25]++;

					}*/
				}
			}
		}
		// ??¢????????????????????????????????????????????¨?????°?????¨???
		char a = 'a';

		for(int i = 0; i < 26; i++){

			System.out.println(a++ + " : " + char_count[i]);

		}
	}
}