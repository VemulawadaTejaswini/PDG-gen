import java.util.*;
class sol{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
      if(s.charAt(s.length()-1)!='s')
         System.out.println(s+"s");
         else
         System.out.println(s+"es");
         
    }
}