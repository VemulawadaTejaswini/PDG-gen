import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
String w=sc.next();
int[] a=new int[26];
    for (int i = 0; i < w.length(); i++) {
        int k=0;
        for (char j = 'a'; j <='z'; j++) {
         if(w.charAt(i)==j)a[k]++;
         k++;
        }
    }
    for (int i = 0; i < 26; i++) {
        if(a[i]%2==1){
            out.println("No");
            break;
        }
        if(i==25&&a[i]%2==0)out.println("Yes");
    }
}}