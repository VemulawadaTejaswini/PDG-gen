import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String s1 = scan.next();

	String s2 = s1.replace("2017","2018");

	System.out.println(s2);
    }
}
