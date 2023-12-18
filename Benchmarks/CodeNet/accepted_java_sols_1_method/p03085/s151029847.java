import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	char b = sc.next().charAt(0);
		switch(b){
          case 'A':
          	System.out.println("T");
          	break;
          case 'T':
          	System.out.println("A");
          	break;
          case 'G':
          	System.out.println("C");
          	break;
          case 'C':
          	System.out.println("G");
          	break;
        }
    }
}