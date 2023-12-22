import java.util.*;
//import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
 //       char [] c = new char[str.length()];
        StringBuilder result =new StringBuilder();//変換した文字を入れる
        
        for( int i = 0;i<str.length();i++){
            char c = str.charAt(i);//一文字づつみていく
            
   //         System.out.println("@"+c);
            
            
            if(Character.isLowerCase(c)){
                result.append(Character.toUpperCase(c));
            }else if(Character.isUpperCase(c)){
                result.append(Character.toLowerCase(c));
            }else{
                result.append(c);
            }
 //           System.out.println(result.toString());
 //           System.out.println(result);
        }System.out.println(result);
    }
}


