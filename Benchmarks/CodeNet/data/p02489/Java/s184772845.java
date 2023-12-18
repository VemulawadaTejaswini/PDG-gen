import java.util.*;
public class Main {
    static Scanner kbd = new Scanner(System.in);
    public Static void main(String[] args){
	int i =1;
	while(kbd.hasNext()){
	    int x = kbd.nextInt();
	    if(x!=0){
		System.out.println("Case "+i+": "+x);
		i++;
	    }
	}
    }
}