import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> numbers = Arrays.asList(sc.nextLine().split(""));
        
        int count = 0;
        for (String number : numbers) {
            if (number.equals("1")) {
                count++;
            }
        }
        System.out.println(count);
	}
}