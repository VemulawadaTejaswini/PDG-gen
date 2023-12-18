import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	boolean[] submit;

	while(sc.hasNext()){
	    submit = new boolean[31];
	    submit[0] = true;
	    
	    for(int i = 0;i<28;i++){ submit[sc.nextInt()] = true; }

	    for(int i = 1;i<28;i++){
		if(!submit[i]) System.out.println(i);
	    }
	}
    }
}