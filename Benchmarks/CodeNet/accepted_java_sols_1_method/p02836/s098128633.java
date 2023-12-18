import java.util.*;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
        String s = sc.next();
//        Long x = sc.nextLong();
        char ch[] = s.toCharArray();
        int count = 0;

        for(int i=0;i<ch.length/2;i++){
            if(ch[i] != ch[ch.length-i-1]){
                count++;
            }
        }
        System.out.println(count);
    }
}