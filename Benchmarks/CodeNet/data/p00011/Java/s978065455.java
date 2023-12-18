import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try {
        	Scanner sc = new Scanner(System.in);

        	int verticalLineNum = sc.nextInt();
        	int horizontalLineNum = sc.nextInt();

        	List<Integer> numberList = new ArrayList<>();

        	for(int i = 1; i <= verticalLineNum; i++) {
        		numberList.add(i);
        	}

        	for(int j = 0; j < horizontalLineNum; j++) {
        		int a = sc.nextInt();
        		int b = sc.nextInt();

        		numberList = swap(numberList, a, b);
        	}
        	System.out.println(numberList);


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