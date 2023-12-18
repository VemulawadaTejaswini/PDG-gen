import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        try {
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        	int verticalLineNum = Integer.parseInt(br.readLine());
        	int horizontalLineNum = Integer.parseInt(br.readLine());

        	List<Integer> numberList = new ArrayList<>();

        	for(int i = 1; i <= verticalLineNum; i++) {
        		numberList.add(i);
        	}

        	for(int j = 0; j < horizontalLineNum; j++) {
        		String str = br.readLine();
                StringTokenizer st = new StringTokenizer(str, ",");

                int a = Integer.parseInt(st.nextToken()) - 1;
                int b = Integer.parseInt(st.nextToken()) - 1;

        		numberList = swap(numberList, a, b);
        	}


        	for(int k = 0; k < verticalLineNum; k++) {
        		System.out.println(numberList.get(k));
        	}

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	private static List<Integer> swap(List<Integer> numberList, int a, int b) {
		int temp = numberList.get(a-1);
		numberList.set(a-1, numberList.get(b-1));
		numberList.set(b-1, temp);
        return numberList;
	}

}