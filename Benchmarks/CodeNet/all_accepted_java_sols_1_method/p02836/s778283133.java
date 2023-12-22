import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        char[] s=sc.next().toCharArray();
        int count=0;
        for(int i=0;i<s.length/2;i++){
            if(s[i]!=s[s.length-1-i])count++;
        }
        System.out.println(count);
    }
}
