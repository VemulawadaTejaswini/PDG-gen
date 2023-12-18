import java.util.*;
class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    char[][] c = 
    { {'a', 'f', 'k', 'p', 'u', 'z'},
      {'b', 'g', 'l', 'q', 'v', '.'},
      {'c', 'h', 'm', 'r', 'w', '?'},
      {'d', 'i', 'n', 's', 'x', '!'},
      {'e', 'j', 'o', 't', 'y', ' '} };
    
    void run(){
	while(sc.hasNext()){
	    String ans = "";
	    char[] num = sc.next().toCharArray();

	    if(num.length%2==1){
		System.out.println("NA");
		continue;
	    }
	    
	    for(int i=0; i<num.length; i+=2){
		int p = Character.getNumericValue(num[i])-1;
		int q = Character.getNumericValue(num[i+1])-1;
		if(p>6 || p<0 || q>5 || q<0){
		    System.out.println("NA");
		    continue;
		}
		ans += c[q][p];
	    }
	    System.out.println(ans);
	}
    }
}