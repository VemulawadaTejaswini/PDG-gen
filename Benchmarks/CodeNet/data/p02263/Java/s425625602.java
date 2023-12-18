import java.util.*;

class Main{

    static boolean isNum(String n) {
	try {
	    Integer.parseInt(n);
	    return true;
	} catch (NumberFormatException e) {
	    return false;
	}
    }
 
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> num = new ArrayList<>();

	while(sc.hasNext()){
	    String str = sc.next();
	    if(isNum(str)){
		num.add(Integer.parseInt(str));
	    }
	    else{
		int x = num.get(num.size()-2);
		int y = num.get(num.size()-1);
		num.remove(num.size()-2);
		num.remove(num.size()-1);
		switch(str){
		case "+":
		    num.add(x+y);
		    break;
		case "-":
		    num.add(x-y);
		    break;
		case "*":
		    num.add(x*y);
		    break;		
		}
	    }
	}
	System.out.println(num.get(0));

    }

}
