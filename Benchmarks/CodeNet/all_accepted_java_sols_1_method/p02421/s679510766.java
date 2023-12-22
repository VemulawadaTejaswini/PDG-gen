import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);

	int taro=0,hanako=0;
	int n = in.nextInt();
	String taro_str,hanako_str;
	int x;
	for(int i=0;i<n;i++){
	    taro_str = in.next();
	    hanako_str = in.next();

	    
	    x=taro_str.compareTo(hanako_str);
	    if(x<0)hanako+=3;
	    else if(x>0)taro+=3;
	    else {
		hanako++;
		taro++;
	    }

	}
	System.out.println(taro + " " + hanako);

    }
}
	
