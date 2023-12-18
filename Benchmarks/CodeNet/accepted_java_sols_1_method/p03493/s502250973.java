import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    int count = 0;
    String num = "1";
    for(int i = 0 ; i < 3 ; ++i){
     	String s = line.substring(i,i+1);
      	if(s.equals(num)){
          ++count;
    	}
    }
    System.out.println(count);
  }
  
}