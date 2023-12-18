
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
public static void main (String[] args){


	Scanner sc =new Scanner(System.in);
	ArrayList<Integer> list=new ArrayList<Integer>();


	while(sc.hasNextLine()) {
		list.add(Integer.parseInt(sc.nextLine()));
	}
	
	int thousand=list.get(0)/1000;
	
	int thousands=(int) Math.floor(thousand)+1;

	System.out.print(thousands*1000-list.get(0));

}}


