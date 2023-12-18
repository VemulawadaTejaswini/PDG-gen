import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (is);
		String input[] = br.readLine().split("");
		int nFlag = 0;
		int wFlag = 0;
		int sFlag = 0;
		int eFlag = 0;
		/*int distanceX = 0;
		int distanceY = 0;
		HashMap<String,Integer> dir = new HashMap<String,Integer>();
		dir.put("N",1);
		dir.put("W",-1);
		dir.put("S",-1);
		dir.put("E",1);*/
		for(String s:input) {
			/*if(s.equals("N") || s.equals("S")) {
				if(distanceY > 0 && s.equals("S")) {
					distanceY +=
				}
				distanceY +=dir.get(s);
			}else if(s.equals("W") || s.equals("E")) {
				distanceX +=dir.get(s);
			}*/
			if(s.equals("N")) {
				nFlag = 1;
			}else if(s.equals("S")) {
				sFlag = 1;
			}else if(s.equals("W")) {
				wFlag = 1;
			}else if(s.equals("E")) {
				eFlag = 1;
			}
		}
		if((nFlag == sFlag) && wFlag ==  eFlag ) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
