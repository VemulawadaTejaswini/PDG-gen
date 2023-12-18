import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String S = sc.next();
      	String T = sc.next();
      	
      	String[] Sr = S.split("");
      	String[] Tr = T.split("");
        
		for(int i=0;i<Sr.length;i++){
        if(Sr[i]==Tr[i]&&Sr.length+1==Tr.length){
        	System.out.println("Yes");
        }
        else{
        System.out.println("No");
        }
        }
		
	}
}