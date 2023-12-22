import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
        String str[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for(int i=0;i<26;i++){if(s.equals(str[i])){System.out.println("a");break;}
                              else{if(i==25){System.out.println("A");}}
                             }
		
		
	}
}
