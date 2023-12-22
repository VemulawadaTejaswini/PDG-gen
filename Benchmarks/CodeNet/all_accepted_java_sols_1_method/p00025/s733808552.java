import java.util.*;

public class Main
{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    String[] a_number = sc.nextLine().split(" ");
	    String[] b_number = sc.nextLine().split(" ");

	    int hit = 0;
	    int brow = 0;

	    for(int i = 0; i < 4; ++i)
		if(a_number[i].equals(b_number[i])){
		    ++hit;
		}

	    for(int i = 0; i < 4; ++i)
		for(int j = 0; j < 4; ++j)
		    if(i != j && a_number[i].equals(b_number[j])){
			++brow;
		    }

	    System.out.printf("%d %d\n", hit, brow);
	}
    }
}