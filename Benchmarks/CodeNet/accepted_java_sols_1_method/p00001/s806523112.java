import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
    public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> iList = new ArrayList<Integer>();

		// ????????????
		for (int i = 0 ; i < 10; i++) {
			iList.add(Integer.valueOf(br.readLine()));
		}

		// ????????????????????????
		Collections.sort(iList);
		for (int i = iList.size() - 1; i > iList.size() - 4; i--) {
			System.out.println(iList.get(i));
		}
    }
}