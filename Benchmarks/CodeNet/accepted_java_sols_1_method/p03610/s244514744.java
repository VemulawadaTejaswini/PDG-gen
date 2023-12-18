import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        char[] arr=s.toCharArray();
        
        for(int i=0;i<s.length();i++) {
            if(i%2==0) {
                System.out.print(arr[i]);
            }
        }
    }
}
