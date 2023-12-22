import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	String str = scan.next();
    	int N = Integer.parseInt(str);
      	str = scan.next();
      	int L = Integer.parseInt(str);
      	ArrayList<String> list = new ArrayList<>();
      	
      	for(int i = 0; i < N; i++){
        	String input = scan.next();
          	list.add(input);
        }
      	
      	Collections.sort(list);
      	for(int i = 0; i < N ; i++){
        	String input = list.get(i);
          	System.out.print(input);
        }
    }
}