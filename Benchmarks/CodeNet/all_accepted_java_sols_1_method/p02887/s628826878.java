import java.util.*;
public class Main{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char[] s=sc.next().toCharArray();
        int i=0,j,count=0;
        while(n>i){
            j=i+1;
            while(n>j&&s[i]==s[j]) j++;
            count++;
            i=j;
        }
        System.out.println(count);
    }
}