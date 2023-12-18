import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
		String s = sc.next();
        String t = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String ans = " ";
        for(int i=0;i<s.length();i++){
          for(int j=0;j<26;j++){if(s.charAt(i)==t.charAt(j))
          {ans+=t.substring((j+a)%26,(j+a)%26+1);break;}                                                           
                               }
                                     }
        System.out.println(ans);
	}
}
