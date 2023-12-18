import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    void run(){
	while(sc.hasNext()){
	    char[] c = sc.next().toCharArray();
	    for(int k=0; k<3; k++)
		for(int i=0; i<c.length; i++)
		if(c[i]>'A')
		    c[i]--;
		else c[i] = 'Z';
		
	    for(int i=0; i<c.length; i++)
		System.out.print(c[i]);
	    System.out.println();
	}
    }
}