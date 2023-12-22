import java.util.*;
 
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
    String[] ln = str.split(" ");
    int n = Integer.parseInt(ln[0]);
    int l = Integer.parseInt(ln[1]);
 
    List<String> strList = new ArrayList<String>(); 

    for(int i = 0; i < n; i++){
  		    strList.add(sc.nextLine());
	}
 
    Collections.sort(strList);
    
    for(String str2 :strList){
	    System.out.print(str2);
    }
  }	
}