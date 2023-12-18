import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner stdin = new Scanner(System.in);
	System.out.println( stdin.nextLine().replace( "apple", "#" ).replace( "peach", "apple" ).replace( "#", "peach" ) );
    }
}