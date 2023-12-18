import java.text.Format;

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	

	void run() {

		/*

		 * @ meiji 1868. 9. 8 ツ〜 1912. 7.29

		 * 

		 * @ taisho 1912. 7.30 ツ〜 1926.12.24

		 * 

		 * @ showa 1926.12.25 ツ〜 1989. 1. 7

		 * 

		 * @ heisei 1989. 1. 8 ツ〜

		 */

		String meiji = "1868.09.08";

		String taisho = "1912.07.30";

		String showa = "1926.12.25";

		String heisei = "1989.01.08";

		for(;sc.hasNextInt();){

			int y = sc.nextInt();

			int m = sc.nextInt();

			int d = sc.nextInt();

			if(y<1000){

				System.out.println("pre-meiji");

				continue;

			}

			String f = y+"."+(m<10?"0":"")+m+"."+(d<10?"0":"")+d;

//			System.out.println(f);

			String nengo = "";

			int year = 0;

			if(y>=10000 || f.compareTo(heisei) >= 0){

				nengo = "heisei";

				year =1+ y - Integer.valueOf(heisei.substring(0,4));

			}else if(f.compareTo(showa)>=0){

				nengo = "showa";				

				year =1+ y - Integer.valueOf(showa.substring(0,4));

			}else if(f.compareTo(taisho)>=0){

				nengo = "taisho";

				year =1+ y - Integer.valueOf(taisho.substring(0,4));

			}else if(f.compareTo(meiji)>=0){

				nengo = "meiji";

				year =1+ y - Integer.valueOf(meiji.substring(0,4));

			}else{

				System.out.println("pre-meiji");

				continue;

			}

			System.out.println(nengo + " " + year + " " + m+ " "+d);

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}