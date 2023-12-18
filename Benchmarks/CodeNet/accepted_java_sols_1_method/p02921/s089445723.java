
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
public static void main (String[] args){


	Scanner sc =new Scanner(System.in);
	ArrayList<String> list=new ArrayList<String>();


	while(sc.hasNext()) {
		list.add(sc.nextLine());
	}
	
	


	int i=0;
	
	if(list.get(0).charAt(0)==list.get(1).charAt(0))i++;
	if(list.get(0).charAt(1)==list.get(1).charAt(1))i++;
	if(list.get(0).charAt(2)==list.get(1).charAt(2))i++;

	

	System.out.print(i);

}
}

