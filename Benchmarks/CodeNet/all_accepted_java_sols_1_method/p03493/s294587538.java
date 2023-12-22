import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int x = 0;

	String ss = sc.nextLine();

	for(int i=0;i<3;i++){
	   char s = ss.charAt(i);
	   if(s == '1') x++;
	}
	System.out.println(x);
    }
}
