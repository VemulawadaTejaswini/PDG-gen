import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int flag = Integer.parseInt(sc.next());
        if(flag == 1){
            System.out.println("Hello World");
        }else{
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            sc.close();
            System.out.println(a + b);
        }
    }
}