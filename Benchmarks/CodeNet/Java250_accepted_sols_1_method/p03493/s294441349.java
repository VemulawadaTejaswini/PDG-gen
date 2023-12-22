import java.util.*;

public class Main{
	public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    String x = scanner.nextLine();
    String[] str = x.split("");
    int a = 0;
    for(String s : str){
    	if(s.equals("1")){a ++ ;}
    }
    System.out.println(a);
    }
}