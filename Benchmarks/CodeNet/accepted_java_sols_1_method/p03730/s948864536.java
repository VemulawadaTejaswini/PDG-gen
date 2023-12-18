import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=a%b,e=0;
    for(int i=1;i<=100;i++){
      if((d*i)%b==c){
        System.out.println("YES");
        e++;
        break;
      }
    }
    if(e==0){
      System.out.println("NO");
    }
  }
}
