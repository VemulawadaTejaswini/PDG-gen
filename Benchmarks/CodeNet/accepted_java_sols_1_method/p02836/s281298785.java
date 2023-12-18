import java.util.*;
 
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String origin = sc.next();
        String[] data = origin.split("");

        int count = 0;
        for (int i = 0; i < (origin.length())/2; i++) {
            if (!(data[i].equals(data[origin.length() - i - 1]))) {
                count++;
            }
        }

        System.out.println(count);
	}
}
