import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = Integer.parseInt(sn.next());
        Integer sum = 0;
        ArrayList<Integer> stateList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            stateList.add(Integer.parseInt(sn.next()));
        }
		Collections.sort(stateList);

        for ( int a = n; a > 1; a--){
			sum = sum + stateList.get(a-1);
        }

        System.out.println(sum);
    }
}


