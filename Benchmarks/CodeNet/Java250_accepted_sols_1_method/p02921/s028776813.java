import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();
        int count =0 ;
        for(int i = 0; i<a.length ; i++){
               if(a[i] ==b[i]){
                   count++;
               }
        }
        System.out.println(count);
    }
}
