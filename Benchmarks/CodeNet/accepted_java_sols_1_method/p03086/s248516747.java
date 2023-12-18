import java.lang.reflect.Array;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int ans = 0;
		int tmpAns = 0;
		boolean onCount = false;

		List<String> inputList = Arrays.asList(S.split(""));

		List<String> acgtList = new ArrayList<>();
		acgtList.add("A");
		acgtList.add("C");
		acgtList.add("G");
		acgtList.add("T");

		for(int i=0; i<inputList.size(); i++){
			if(acgtList.contains(inputList.get(i))){
				onCount = true;
				tmpAns++;
			} else{
				if(onCount){
					if(tmpAns > ans){
						ans = tmpAns;
					}
				}
				onCount = false;
				tmpAns = 0;
			}
		}

		if(tmpAns > ans){
			ans = tmpAns;
		}


        System.out.println(ans);


	}

}

