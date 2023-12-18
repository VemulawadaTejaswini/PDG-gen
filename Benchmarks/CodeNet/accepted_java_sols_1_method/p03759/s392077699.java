import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int[] n=new int[3];
    for(int i=0;i<3;i++){
      n[i]=sc.nextInt();
    }
    
    if(n[1]-n[0]==n[2]-n[1]){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
