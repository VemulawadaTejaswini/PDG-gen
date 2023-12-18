import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		boolean[] isHave = new boolean[53]; isHave[0] = true;
		HashMap<String, Integer> mark = new HashMap<String, Integer>();
		mark.put("S", 0); mark.put("H", 1*13-1); mark.put("C",2*13-1); mark.put("D", 3*13-1);
		
		int n = in.nextInt();
		for(int i=0;i<n;i++){
			String m = in.next();
			int num = in.nextInt();
			
			isHave[(mark.get(m) + num)-1] = true;
		}
		
		for(int i=0;i<isHave.length;i++){
			if(!isHave[i]){
				int soeji = (i-1) / 13;
				System.out.printf("%s %d\n",
					soeji == 0 ? "S" : soeji == 1 ? "H" : soeji == 2 ? "C" : soeji == 3 ? "D" : "no..."+soeji,
					i%13 == 0 ? 13 : i%13);
			}
		}
	}

}