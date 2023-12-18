import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        Stack<String> s[]=new Stack[n+1];
        for(int i=1;i<=n;i++){
            s[i]=new Stack<String>();
        }
        String str;
        String[] a=new String[3];
        while(true){
            str=sc.nextLine();
            if(str.equals("quit"))break;
            a=str.split(" ");
            if(a[0].equals("push")){
                s[Integer.parseInt(a[1])].add(a[2]);
            }else if(a[0].equals("move")){
                s[Integer.parseInt(a[2])].add(s[Integer.parseInt(a[1])].pop());
            }else if(a[0].equals("pop")){
                System.out.println(s[Integer.parseInt(a[1])].pop());
            }
        }
    }
}