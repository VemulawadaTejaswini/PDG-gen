import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
 
		Integer[] a = { 1, 3, 5, 7, 8, 10, 12 };
        Integer[] b = { 4, 6, 9, 11};
	    Integer[] c = { 2};
    
		if (Arrays.asList(a).contains(x)==true && Arrays.asList(a).contains(y)==true ||Arrays.asList(b).contains(x)==true && Arrays.asList(b).contains(y)==true||Arrays.asList(c).contains(x)==true && Arrays.asList(c).contains(y)==true) {
			System.out.print("Yes");
		}else{
			System.out.print("No");
		}
	}
}