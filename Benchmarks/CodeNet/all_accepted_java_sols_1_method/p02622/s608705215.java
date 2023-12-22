import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
      String b = sc.next();
int count=0;
      for(int i= 0;i<a.length();i++){
      	if(!a.substring(i,i+1).equals(b.substring(i,i+1))){
          count++;
      	}
      }

      System.out.println(count);
      
	}
}