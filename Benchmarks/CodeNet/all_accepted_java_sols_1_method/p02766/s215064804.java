    import java.util.*;
     
    public class Main {
    	public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String[] str = scan.nextLine().split(" ");
    		String value = Integer.toString(new Integer(str[0]),new Integer(str[1]));
    		System.out.println(value.length()); //output = 1e
        }
    }