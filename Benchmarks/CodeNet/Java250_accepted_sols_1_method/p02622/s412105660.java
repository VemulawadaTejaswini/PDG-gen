import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str01 = sc.next();
    String str02 = sc.next();
    
    int count = 0;
    if(str01.equals(str02)){
    	System.out.println(count);
    }else{
    	for(int i = 0; i < str01.length(); i++){
        	if(str01.charAt(i) != str02.charAt(i)){
		 		count++;
            }
        }
      System.out.println(count);
    }
    
  }
}