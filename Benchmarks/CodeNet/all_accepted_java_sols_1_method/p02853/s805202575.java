import java.util.*;

public class Main{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int x =sc.nextInt();
	int y =sc.nextInt();
	int m =0;
	if(x==1 && y==1){
	    m=+700000;
	}else if(x==1){
	    m+=300000;
	}else if(x==2){
	    m+=200000;
	}else if(x==3){
	    m+=100000;
	}else{
	}

	if(y==1){
	    m+=300000;
	}else if(y==2){
	    m+=200000;
	}else if(y==3){
	    m+=100000;
	}else{
	}
	System.out.println(m);
    }
}
