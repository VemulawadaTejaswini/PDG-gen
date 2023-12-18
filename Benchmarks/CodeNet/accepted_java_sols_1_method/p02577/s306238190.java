import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S=sc.next();
		int tmp=0;
      	String ttt;
		for(int i=1;i<9;i++){
          	ttt = String.valueOf(i);;
			tmp+=i*(S.length() - S.replace(ttt,"").length());
		}
		if(tmp%9==0){
			System.out.println("Yes");
        }else{
			System.out.println("No");
		}
	}
}