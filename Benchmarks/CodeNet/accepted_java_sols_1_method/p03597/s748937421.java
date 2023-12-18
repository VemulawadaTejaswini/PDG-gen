import java.util.*;

public class Main{
    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int masume = sc.nextInt();
	masume = masume * masume;

	int white = sc.nextInt();
	System.out.println(masume - white);
    }
}
