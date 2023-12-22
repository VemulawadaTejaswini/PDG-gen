import java.util.Scanner;
import java.awt.event.KeyEvent;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	String box[] = new String[1200];
	  	int con[] =  new int[30];
		int num = 0;
		
		while(scanner.hasNext()) {
			String str = scanner.nextLine();			//入力
				if(str == null)
					break;
				num = str.length();		//文字数取得
				
				//文字数計算
				for(int i = 0; i < num ;i ++) {
				    if( Character.isUpperCase( str.charAt( i ) ) ) {
			  			box[i] = str.substring(i,i + 1);
			  			box[i] = box[i].toLowerCase();
					}else{
				    	box[i] = str.substring(i,i + 1);
				    }
				    switch(box[i]){
				    case "a":
				    	con[0] ++;
				    	break;
				    case "b":
				    	con[1] ++;
				    	break;
				    case "c":
				    	con[2] ++;
				    	break;
				    case "d":
				    	con[3] ++;
				    	break;
				    case "e":
				    	con[4] ++;
				    	break;
				    case "f":
				    	con[5] ++;
				    	break;
				    case "g":
				    	con[6] ++;
				    	break;
				    case "h":
				    	con[7] ++;
				    	break;
				    case "i":
				    	con[8] ++;
				    	break;
				    case "j":
				    	con[9] ++;
				    	break;
				    case "k":
				    	con[10] ++;
				    	break;
				    case "l":
				    	con[11] ++;
				    	break;
				    case "m":
				    	con[12] ++;
				    	break;
				    case "n":
				    	con[13] ++;
				    	break;
				    case "o":
				    	con[14] ++;
				    	break;
				    case "p":
				    	con[15] ++;
				    	break;
				    case "q":
				    	con[16] ++;
				    	break;
				    case "r":
				    	con[17] ++;
				    	break;
				    case "s":
				    	con[18] ++;
				    	break;
				    case "t":
				    	con[19] ++;
				    	break;
				    case "u":
				    	con[20] ++;
				    	break;
				    case "v":
				    	con[21] ++;
				    	break;
				    case "w":
				    	con[22] ++;
				    	break;
				    case "x":
				    	con[23] ++;
				    	break;
				    case "y":
				    	con[24] ++;
				    	break;
				    case "z":
				    	con[25] ++;
				    	break;
				    default:
				    	break;
				    }
				}
		}
		//出力
		System.out.println("a : " + con[0]);
		System.out.println("b : " + con[1]);
		System.out.println("c : " + con[2]);
		System.out.println("d : " + con[3]);
		System.out.println("e : " + con[4]);
		System.out.println("f : " + con[5]);
		System.out.println("g : " + con[6]);
		System.out.println("h : " + con[7]);
		System.out.println("i : " + con[8]);
		System.out.println("j : " + con[9]);
		System.out.println("k : " + con[10]);
		System.out.println("l : " + con[11]);
		System.out.println("m : " + con[12]);
		System.out.println("n : " + con[13]);
		System.out.println("o : " + con[14]);
		System.out.println("p : " + con[15]);
		System.out.println("q : " + con[16]);
		System.out.println("r : " + con[17]);
		System.out.println("s : " + con[18]);
		System.out.println("t : " + con[19]);
		System.out.println("u : " + con[20]);
		System.out.println("v : " + con[21]);
		System.out.println("w : " + con[22]);
		System.out.println("x : " + con[23]);
		System.out.println("y : " + con[24]);
		System.out.println("z : " + con[25]);
		
		scanner.close();
  }
  
}
