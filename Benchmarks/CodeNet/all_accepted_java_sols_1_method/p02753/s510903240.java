import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
        String s = sc.next();
        String[] slist = s.split("");
        int i;
      	if(slist[0].equals("A") && slist[1].equals("A") && slist[2].equals("A")){
        	System.out.println("No");
        }else if(slist[0].equals("B") && slist[1].equals("B") && slist[2].equals("B")){
          System.out.println("No");
        }else{
          System.out.println("Yes");          
        }
	}
}