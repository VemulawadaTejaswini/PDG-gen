import java.util.*;

public class Main{

    public Main(){
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	str = str.replace("apple", "_");
	str = str.replace("peach", "apple");
	str = str.replace("_", "peach");
	System.out.println(str);
    }

    public static void main(String[] args){
	new Main();
    }
}