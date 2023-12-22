import java.util.Scanner;
public class Main{
	public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
      String N = scn.next();
      scn.close();
      int s=0;
      for(int i = 0; i<3 ; i++){
      if(N.charAt(i) == '7'){
      s +=1;
      }
      }
  	if(s>0){
    System.out.println("Yes");
    }else{
    System.out.println("No");
    }
    }
}
