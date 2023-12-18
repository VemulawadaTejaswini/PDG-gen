

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		String[] input2;

		int[] s = new int[13];
		int[] h = new int[13];
		int[] c = new int[13];
		int[] d = new int[13];

		int kazu = Integer.parseInt(br.readLine());
		for (int i = 0; i < kazu; i++) {
			input = br.readLine();
			input2 = input.split(" ");

			if ("S".equals(input2[0])) {// ????????????
				for (int j = 0; j < 13; j++) {
					if (Integer.parseInt(input2[1]) == j - 1) {
						s[j - 1] = Integer.parseInt(input2[1]);
					}
				} // for

			} else if ("H".equals(input2[0])) {// ?????????
				for (int j = 0; j < 13; j++) {
					if (Integer.parseInt(input2[1]) == j - 1) {
						h[j - 1] = Integer.parseInt(input2[1]);
					}
				} // for

			} else if ("C".equals(input2[0])) {// ?????????
				for (int j = 0; j < 13; j++) {
					if (Integer.parseInt(input2[1]) == j - 1) {
						c[j - 1] = Integer.parseInt(input2[1]);
					}
				} /// for

			} else {// ?????????
				for (int j = 0; j < 13; j++) {
					if (Integer.parseInt(input2[1]) == j - 1) {
						d[j - 1] = Integer.parseInt(input2[1]);
					}
				} // for
				}//if(????????????)
			}//for(input??????)


	    //output??????
		for(int i=0; i<13; i++){
			if(s[i] == 0 ){
				System.out.println("S " + s[i]);
			}
		}//????????????

		for(int i=0; i<13; i++){
			if(h[i] == 0 ){
				System.out.println("H " + h[i]);
			}
		}//?????????

		for(int i=0; i<13; i++){
			if(c[i] == 0 ){
				System.out.println("C " + c[i]);
			}
		}//?????????

		for(int i=0; i<13; i++){
			if(d[i] == 0 ){
				System.out.println("D " + d[i]);
			}
		}//?????????


	}//main

}