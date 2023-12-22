import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner reader=new Scanner(System.in);
    int A= reader.nextInt();
    int B= reader.nextInt();
    int C= reader.nextInt();
    int D= reader.nextInt();
    int X=A+B;
    int Y=C+D;
    if (X>Y) {
    	System.out.println("Left");
    }
    else if(Y>X) {
    	System.out.println("Right");
    
	}
    else {
    	System.out.println("Balanced");	
    }
    }

}
