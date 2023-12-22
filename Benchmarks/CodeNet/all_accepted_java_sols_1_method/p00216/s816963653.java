import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	
	while(kbd.hasNext()){
	    int w = kbd.nextInt();
	    if(w!=-1){
		int t = 1150;
		w-=10;
		int m = 0;
		while(w>0){
		    if(m/10 == 0) t += 125;
		    else if(m/10 == 1) t+=140;
		    else t+=160;
		    
		    w--;
		    m++;
		}
		System.out.println(4280 - t);
	    }
	}
    }
}