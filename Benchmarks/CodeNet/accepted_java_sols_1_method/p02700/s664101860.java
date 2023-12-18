import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int takaHP = sc.nextInt();
        int takaA = sc.nextInt();
		int aokiHP = sc.nextInt();
        int aokiA = sc.nextInt();
      
      while(takaHP>0){
        aokiHP -= takaA;
        if(aokiHP<=0){
          break;
        }
        takaHP -= aokiA;
      }
      
      if(aokiHP<=0){
      System.out.println("Yes");
      }else{
      System.out.println("No");
      }
    }
}
