//??±?????????????????°?????°??????
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int[] sigNum = new int[26];				//??????????????°???????¨?????????????sigNum
		String str = "";
		int cnt = 0;								//??\????????????????????????????????????cnt
		
		do{
			str = br.readLine().toLowerCase();
			
			//??\????????????????????°???????¨????1200????¶?????????´??????break
			cnt = cnt + str.length();
			if(cnt >=1200) {
				break;
			}
			
			//???????????????????????????????????§???????????°????????????????´?
			for(int i=0; i<str.length(); i++) {
				
				switch(str.charAt(i)){
					case 'a':
						sigNum[0] = sigNum[0] +1;
						break;
					case 'b':
						sigNum[1] = sigNum[1] +1;
						break;
					case 'c':
						sigNum[2] = sigNum[2] +1;
						break;
					case 'd':
						sigNum[3] = sigNum[3] +1;
						break;
					case 'e':
						sigNum[4] = sigNum[4] +1;
						break;
					case 'f':
						sigNum[5] = sigNum[5] +1;
						break;
					case 'g':
						sigNum[6] = sigNum[6] +1;
						break;
					case 'h':
						sigNum[7] = sigNum[7] +1;
						break;
					case 'i':
						sigNum[8] = sigNum[8] +1;
						break;
					case 'j':
						sigNum[9] = sigNum[9] +1;
						break;
					case 'k':
						sigNum[10] = sigNum[10] +1;
						break;
					case 'l':
						sigNum[11] = sigNum[11] +1;
						break;
					case 'm':
						sigNum[12] = sigNum[12] +1;
						break;
					case 'n':
						sigNum[13] = sigNum[13] +1;
						break;
					case 'o':
						sigNum[14] = sigNum[14] +1;
						break;
					case 'p':
						sigNum[15] = sigNum[15] +1;
						break;
					case 'q':
						sigNum[16] = sigNum[16] +1;
						break;
					case 'r':
						sigNum[17] = sigNum[17] +1;
						break;
					case 's':
						sigNum[18] = sigNum[18] +1;
						break;
					case 't':
						sigNum[19] = sigNum[19] +1;
						break;
					case 'u':
						sigNum[20] = sigNum[20] +1;
						break;
					case 'v':
						sigNum[21] = sigNum[21] +1;
						break;
					case 'w':
						sigNum[22] = sigNum[22] +1;
						break;
					case 'x':
						sigNum[23] = sigNum[23] +1;
						break;
					case 'y':
						sigNum[24] = sigNum[24] +1;
						break;
					case 'z':
						sigNum[25] = sigNum[25] +1;
						break;
					default:
						break;
				}	
			}
		}while(!str.contains("."));				//??±????????????????????¨??\??????????????????
		
		//??\???????????°???1200????????\??????????????¢?????????????????????????????°?????????
		if(cnt <1200) {
			System.out.println("a : " +sigNum[0]);
			System.out.println("b : " +sigNum[1]);
			System.out.println("c : " +sigNum[2]);
			System.out.println("d : " +sigNum[3]);
			System.out.println("e : " +sigNum[4]);
			System.out.println("f : " +sigNum[5]);
			System.out.println("g : " +sigNum[6]);
			System.out.println("h : " +sigNum[7]);
			System.out.println("i : " +sigNum[8]);
			System.out.println("j : " +sigNum[9]);
			System.out.println("k : " +sigNum[10]);
			System.out.println("l : " +sigNum[11]);
			System.out.println("m : " +sigNum[12]);
			System.out.println("n : " +sigNum[13]);
			System.out.println("o : " +sigNum[14]);
			System.out.println("p : " +sigNum[15]);
			System.out.println("q : " +sigNum[16]);
			System.out.println("r : " +sigNum[17]);
			System.out.println("s : " +sigNum[18]);
			System.out.println("t : " +sigNum[19]);
			System.out.println("u : " +sigNum[20]);
			System.out.println("v : " +sigNum[21]);
			System.out.println("w : " +sigNum[22]);
			System.out.println("x : " +sigNum[23]);
			System.out.println("y : " +sigNum[24]);
			System.out.println("z : " +sigNum[25]);
		}

	}
}