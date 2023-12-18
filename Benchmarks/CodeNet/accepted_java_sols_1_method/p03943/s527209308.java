import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> array = new ArrayList<Integer>();
        for (int i=0; i<3; i++){
        	array.add(Integer.parseInt(sc.next()));
        }
        Collections.sort(array);

        if (array.get(0) + array.get(1) == array.get(2)){
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
    }
}