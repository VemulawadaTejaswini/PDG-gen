import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String[] a){
    	List<Integer> numList = new ArrayList<>();
    	Scanner scanner = new Scanner(System.in);
    	for(int i=0;i<10;i++){
    		numList.add(scanner.nextInt());
    	}
    	numList.sort(Comparator.reverseOrder());
    	for(int j=0; j<3; j++){
    		System.out.println(numList.get(j));
    	}
    	scanner.close();
    }
}