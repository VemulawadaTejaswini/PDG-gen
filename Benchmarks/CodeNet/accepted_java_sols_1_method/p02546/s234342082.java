import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if (s.endsWith("s"))
            System.out.print(s+"es");
        else
            System.out.print(s+"s");
    }
}