import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	List<Integer> list = new ArrayList<Integer>();
	while(sc.hasNext()){
	    list.add(sc.nextInt());
	}

	for(int i=0; i<list.size(); i++){
	    if(list.get(i)==0){
		System.out.println(list.get(i-1));
		list.remove(i);
		list.remove(i-1);
		i = i-2;
	    }
	}
    }
}