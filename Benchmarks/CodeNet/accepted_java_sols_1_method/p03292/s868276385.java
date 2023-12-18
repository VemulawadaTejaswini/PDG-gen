import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
      
         int x =  Math.abs((c-a)+(b-c));
         int y =  Math.abs((b-c)+(a-b));
         int z =  Math.abs((a-b)+(c-a));
         
         int d =  Math.max(x,y);
         int e =  Math.max(d,z);
      
         System.out.println(e);
        
    }
}