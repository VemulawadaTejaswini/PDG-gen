
public class Main {

    public static void main(String[] args) {
    	
    	//declare    	
    	int      a,b,n,mod,s;
    	String[] str;
    	
    	//input
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext()){
    		str = sc.nextLine().split("\\s");
    		a   = Integer.parseInt(str[0]);
    		b   = Integer.parseInt(str[1]);
    		n   = Integer.parseInt(str[2]);
    		
    		//calculate
    		s = 0;
    		a %= b;
    		while(n-- > 0){
    			a *= 10;
    			s += a / b;
    			a %= b;
    		}
    		//output
    		System.out.println(s);
    	}
    }
}