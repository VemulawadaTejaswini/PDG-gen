import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
      int N=sc.nextInt();
      int wa=0;
      int ac=0;
      int tle=0;
      int re=0;
      for(int i=0;i<N+1;i++){
      String ch=sc.nextLine();
       if(ch.equals("AC")){
         ac++;
       }
        if(ch.equals("WA")){
          wa++;
       }
       if(ch.equals("TLE")){
         tle++;
       }
       if(ch.equals("RE")){
         re++;
       }
      }
      System.out.println("AC x "+ac);
      System.out.println("WA x "+wa);
      System.out.println("TLE x "+tle);
      System.out.println("RE x "+re);
}
}