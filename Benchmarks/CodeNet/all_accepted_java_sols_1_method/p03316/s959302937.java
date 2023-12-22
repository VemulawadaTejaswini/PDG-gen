
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String str=String.valueOf(num);
        int NUM=0;

        for(int i=0;i<str.length();i++){
            NUM+=Character.getNumericValue(str.charAt(i));
        }
        
        if(num%NUM==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}