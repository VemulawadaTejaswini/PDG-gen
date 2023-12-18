import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str;
        String w="";
        while(sc.hasNext()){
            System.out.print(w);
            w=" ";
            str=sc.next();
            /*System.out.print(str+" ");*/
            for(int i=0;i<str.length();i++){
                char a=str.charAt(i);
                if (Character.isUpperCase(a)){
                    a+=32;
                }else if(Character.isLowerCase(a)){
                    a-=32;
                }
                System.out.print(a);
            }
            
        }
    System.out.println("");
    }
}
