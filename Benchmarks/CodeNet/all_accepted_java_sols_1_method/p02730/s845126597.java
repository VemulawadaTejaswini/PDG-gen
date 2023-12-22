import java.util.*;

class Main{
	public static void main(String[] args){
      Scanner scn = new Scanner(System.in);
      String word = scn.nextLine();
      int n = word.length();
      int m = (n-1)/2;
      for(int i = 0; i < m+1;i++){
        if(word.charAt(i)!=word.charAt(n-1-i)){
          System.out.println("No");
          return;
        }
      }
      for(int j = 0; j<(m+1)/2;j++){
        if(word.charAt(j)!=word.charAt(m-1-j)){
          System.out.println("No");
          return;
        }
      }
      System.out.println("Yes");
	}
}
