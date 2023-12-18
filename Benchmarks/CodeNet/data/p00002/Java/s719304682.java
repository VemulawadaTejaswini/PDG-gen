import java.util.*;
public class Main{
    public static void main(String[] args){
	Scanner buf = new Scanner(System.in);
	String s;
	int i,j;
	int len;
	while((s = buf.next()) != null){
	    i = Integer.parseInt(s);
	    j = buf.nextInt();
	    len = i + j;
	    s = Integer.toString(len);
	    System.out.println(s.length());
	}
    }
}