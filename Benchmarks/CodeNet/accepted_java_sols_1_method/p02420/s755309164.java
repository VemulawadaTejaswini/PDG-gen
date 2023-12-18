import java.util.*;


public class Main{
    public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    int a,b ;
    
    while (true) {
        String str = sc.next();
        if (str.equals("-")) {
      break; 
        }
        int i = 0;
        b = sc.nextInt();
        while(i!=b){
        String str1,str2;
        a = sc.nextInt();
        int ln =str.length();
        str1 = str.substring(0,a);
        str2 = str.substring(a,ln);
        str = "";
        str = str2 + str1;
        i++;
        }
        System.out.println(str);
    }

    }
}
