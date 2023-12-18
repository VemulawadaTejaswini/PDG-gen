import java.util.*;

public class Main{
    public static void main(String[] args){
	ArrayList<Integer> array = new ArrayList<Integer>();
	int i = 0, x;
	Scanner sc = new Scanner(System.in);
	do{
	    x = sc.nextInt();
	    array.add(x);
	    i++;
	}while(array.get(i-1) != 0);
	for (x = 0; x<i-1; x++)
	    System.out.println("Case "+(x+1)+": "+array.get(x));
    }
}