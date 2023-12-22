import java.util.*;
public class Main {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       String t = sc.nextLine();
       int  n = t.length();
       int m = s.length();
       int ans = Integer.MAX_VALUE;
    for (int i = 0; i < m - n + 1; i++) 
    { 
        int minRemovedChar = 0; 
        for (int j = 0; j < n; j++)  
        { 
            if (t.charAt(j) != s.charAt(i + j))  
            { 
                minRemovedChar++; 
            } 
        } 
        ans = Math.min(minRemovedChar, ans); 
    } 
  System.out.println(ans);
} 
  
}