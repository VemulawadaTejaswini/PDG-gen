import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
    char tmp = a.charAt(0);
    int ans = tmp;
    if(ans >= 97){
      System.out.println("a");
    }else System.out.println("A");
	}
}
