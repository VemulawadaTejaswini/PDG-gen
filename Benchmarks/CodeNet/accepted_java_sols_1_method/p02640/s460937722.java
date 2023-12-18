import java.util.*;
 
public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);

		int all=sc.nextInt();
      	int foot=sc.nextInt();
      	int tsuru = all * 2;
      	if (tsuru == foot){
          	System.out.print("Yes");
          	return;
        }else if(tsuru > foot){
          	System.out.print("No");
          	return;
        }else if(tsuru < foot){
          	int kame = foot - tsuru;
          	if(kame/2 <= all && kame%2 == 0){
              System.out.print("Yes");
              return;
            }
          	System.out.print("No");
        }
	}
}