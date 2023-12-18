import java.util.*;
public class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
      	String[] abc = new String[3];
      	for(int i = 0; i < 3; i++){
        	abc[i] = sc.next().toUpperCase();
        }
      	for(int i = 0; i < 3; i++){
        	System.out.print(abc[i].charAt(0));
        }
    }
}