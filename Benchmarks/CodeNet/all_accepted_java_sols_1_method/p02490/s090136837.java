import java.util.*;

class Main {
    public static void main(String[] args) {
	int i, j, swap;
	Scanner in = new Scanner(System.in);
	ArrayList<Integer> array = new ArrayList<Integer>();
	ArrayList<Integer> array2 = new ArrayList<Integer>();
	for(i=0; in.hasNext(); i++){
	    array.add(in.nextInt());
	    if(i%2==1)
		if(array.get(i-1) == 0 && array.get(i) == 0)
		    break;
	}
	for(j=0; j<i-1; j=j+2){
	    if(array.get(j)<=array.get(j+1))
		System.out.println(array.get(j)+" "+array.get(j+1));
	    else
		System.out.println(array.get(j+1)+ " "+array.get(j));
	}
    }
}