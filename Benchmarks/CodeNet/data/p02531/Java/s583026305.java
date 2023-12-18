import java.util.*;
//かわいい彼女と水族館デートしたい
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str;
        Stack<String> s=new Stack<String>();
        while(true){
            str=sc.nextLine();
            if(str.equals("quit"))break;
            String[] a=str.split(" ");
            if(a[0].equals("push")){
                s.add(a[1]);
            }else if(a[0].equals("pop")){
                System.out.println(s.pop());
            }
        }
    }
}