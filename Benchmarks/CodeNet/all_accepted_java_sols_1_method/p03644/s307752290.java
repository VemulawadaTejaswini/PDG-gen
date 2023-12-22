import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt();
    for(int i=n;i>=1;i--){
      if(i==2||i==4||i==8||i==16||i==32||i==64){
        System.out.println(i);
        break;
      }
      if(i==1){
        System.out.println(i);
        break;
      }
    }
  }
}
