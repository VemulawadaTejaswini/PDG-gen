import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//?????°??¨??????????????°???????????????
		int people = sc.nextInt();
		int ivent = sc.nextInt();

		Map<Integer, Integer> wakasagi = new HashMap<Integer, Integer>();


		//??????????????£????????????????????????
		for(int $ = 0; $ < ivent; $++) {
			int entryNum = sc.nextInt(); //?????????????????????
			int wakasagiNum = sc.nextInt(); //?????????????????°
			int num;

			if($ == 0) {
				wakasagi.put(entryNum, wakasagiNum);
				System.out.println(entryNum + " " + wakasagiNum);
			} else {
				if(wakasagi.get(entryNum) != null){
					wakasagi.put(entryNum, wakasagiNum + wakasagi.get(entryNum));
				} else {
					wakasagi.put(entryNum, wakasagiNum);
				}

				List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(wakasagi.entrySet());

				Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>()
		        {
		            //compare????????¨????????????????????????
		            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2)
		            {
		                //??????
		                return obj2.getValue().compareTo(obj1.getValue());
		            }
		        });


				System.out.println(list_entries.get(0).getKey() + " " + list_entries.get(0).getValue());

			}

		}
	}
}