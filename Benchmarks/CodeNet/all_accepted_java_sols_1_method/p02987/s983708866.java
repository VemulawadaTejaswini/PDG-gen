import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String str = sc.next();
    
	int count = 0;
    
    for(int i=0; i<4; i++){
      for(int j=i+1; j<4; j++){
        if(str.charAt(i) == str.charAt(j)){
          count++;
        }
      }
    }
    
    if(count == 2){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}