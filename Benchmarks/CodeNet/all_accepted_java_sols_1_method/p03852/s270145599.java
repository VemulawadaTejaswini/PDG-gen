/*
 * 英小文字 c が与えられるので、c が母音であるか判定してください。ここで、英小文字のうち母音は a、e、i、o、uの 5 つです。
 */

import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            
            String s = sc.next();
            
            if(s.equals("a") || s.equals("i") || s.equals("u") || s.equals("e") || s.equals("o")){
            	System.out.println("vowel");
            }else{
            	System.out.println("consonant");
            }
            sc.close();
        }
    }
	