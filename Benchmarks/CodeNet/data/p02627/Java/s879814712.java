import java.util.*;
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.equals(s.toLowerCase())&&!s.equals(s.toUpperCase())){
            System.out.println("a");
        } else {
            System.out.println("A");
        }
    }
}
