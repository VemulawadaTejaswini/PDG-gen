import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        int mod = 0;
        for(int i=0;i<s.length();i++){int a = (int)(s.charAt(i))-48;
                                      if(a>0){mod+=a;}                                    
                                     }       
		if(mod==0 || mod%9==0){System.out.println("Yes");}
      else{System.out.println(mod);}
	}
}