import java.util.*;
import static java.lang.Math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        char s[] = sc.next().toCharArray();
        if(s[k-1]=='A'){
            s[k-1] = 'a';
        }
        if(s[k-1]=='B'){
            s[k-1] = 'b';
        }
        if(s[k-1]=='C'){
            s[k-1] = 'c';
        }
        for(int i=0; i<n; i++){
            System.out.print(s[i]);
        }
        System.out.println("");

    }
}