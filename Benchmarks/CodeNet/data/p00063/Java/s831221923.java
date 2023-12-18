import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
 
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        int ans=0;
        while(scan.hasNext())
        if(isPalindrome(scan.nextLine()))ans++;
        System.out.println(ans);

    }
    
    public static boolean isPalindrome(String str){
    	String[] strs = str.split("//B");
    	String restr ="";
    	for(int i=(strs.length) - 2;i>=0;i--){
			restr+=strs[i]; //逆順に再結合
		}
    	restr+="\n";
    	
    	if(restr.equals(str))return true;
    	else return false;
    }
}