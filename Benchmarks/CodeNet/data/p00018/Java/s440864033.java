import java.util.*;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);
	int[] ary = new int[5];
	while(sc.hasNext()){
	    for(int i = 0; i < 5; i++)
		ary[i] = sc.nextInt();

	    Arrays.sort(ary);
	    System.out.print(Integer.toString(ary[4]));
	    for(int i = 3; i >= 0; i--)
		System.out.print(" " + Integer.toString(ary[i]));
	    System.out.println();
	}
    }

    public static void main(String[] args){
	new p0018();
    }
}