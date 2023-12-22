import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float d = sc.nextFloat();
        float t = sc.nextFloat();
        float s = sc.nextFloat();
        System.out.println(d / s <= t ? "Yes" : "No");
	}
}