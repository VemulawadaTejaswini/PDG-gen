import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            String order = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(order.equals("print")){
                if(b == str.length() - 1){
                    System.out.println(str.substring(a));
                }else{
                    System.out.println(str.substring(a, b + 1));
                }
            }else if(order.equals("reverse")){
                if(b == str.length() - 1){
                    StringBuffer sb = new StringBuffer(str.substring(a));
                    sb = sb.reverse();
                    str = str.substring(0, a) + sb.toString();
                }else{
                    StringBuffer sb = new StringBuffer(str.substring(a, b + 1));
                    sb = sb.reverse();
                    str = str.substring(0, a) + sb.toString() + str.substring(b + 1);
                }
            }else if(order.equals("replace")){
                String p = sc.next();
                if(b == str.length() - 1){
                    str = str.substring(0, a) + p;
                }else{
                    str = str.substring(0, a) + p + str.substring(b + 1);
                }
            }
        }
    }
}
