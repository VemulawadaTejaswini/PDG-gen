import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        for(int i = 0;i < c.length;i++){
            if(c[i] == '7'){
                System.out.println("Yes");
                return;
            }
                
        }
        System.out.println("No");
    }
}