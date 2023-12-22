import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashMap<String,Integer> tango = new HashMap<String,Integer>();
		ArrayList<String> eng = new ArrayList<String>();
		String retu;
		String abc;
		String hoji = null;
		String nagasa = null;
		int nagasa2 =0;
		int max = 0;
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			retu = scan.next();
			eng.add(retu);
		}
		for(int i = 0 ; i < eng.size(); i++){
			eng.get(i);
			abc = eng.get(i);
			//??????????¨????
			if(!tango.containsKey(abc)){
				tango.put(abc,1);
			}else{
				int cnt = tango.get(abc);
				tango.put(abc,++cnt);

				if(max < cnt){
					max = cnt;
					hoji = abc;

				}
			}
			if(nagasa2 < abc.length()){
				nagasa2 = abc.length();
				nagasa = abc;
			}

		}



		System.out.println(hoji + " " + nagasa);

	}
}