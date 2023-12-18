import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       String str = sc.nextLine();
       char check;

       for(int i = 0;i < str.length();i++){
            check = str.charAt(i);
            if(check >= 'a' && check <= 'z')    System.out.print((char)(check - 32));
            else if(check >= 'A' && check <= 'Z')    System.out.print((char)(check + 32));
            else    System.out.print(check);
       }
       System.out.println();
    }
}
