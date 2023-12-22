import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;
public class Main {
	public static void main(String args[]){
      	Scanner sc = new Scanner(System.in);
      	String a = sc.nextLine();
        String[] b = a.split(" ");
        int[] c = Stream.of(b).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(c);
        int p = (c[1]-c[0]+c[2]-c[1]);
        System.out.println(p);
    }
}