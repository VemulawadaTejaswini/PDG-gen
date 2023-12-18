import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        if(t.substring(0,t.length()-1).equals(s)){System.out.println("Yes");}
        else{System.out.println("No");}
    }
}

