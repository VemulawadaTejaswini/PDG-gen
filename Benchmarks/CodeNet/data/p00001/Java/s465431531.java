//
//  HillsOfTop3.java
//  HillsOfTop3
//
//  Created by hajime on 14/03/30.
//  Copyright (c) 2014 __MyCompanyName__. All rights reserved.
//
import java.util.*;
import java.io.*;

class HillsOfTop3 {

    public static void main (String args[]) {
		int[] mountain = new int[10];
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			for (int i = 0; i < 10; i++) {
				int num = Integer.parseInt(br.readLine());
				if (num >= 0 && num <= 10000) {
					mountain[i] = num;
				}
			}
			
			Arrays.sort(mountain);
			
			for (int i = 9; i > 6; i--) {
				System.out.println(mountain[i]);
			}
			System.exit(0);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
    }
}