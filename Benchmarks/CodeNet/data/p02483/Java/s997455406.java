import java.util.*;

class Main{
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
	ArrayList<Integer> list = new ArrayList<Integer>();

	for(int i=0 ; i < 3 ; i++)
	    list.add(s.nextInt());

	Collections.sort(list);
	
	for(int i=0 ; i < 3 ; i++){
	    if(i!=0)System.out.println(" ");
	    System.out.println(list.get(i));
	}
	System.out.println();
    }
}