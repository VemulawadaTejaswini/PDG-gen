import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.math.*;
 
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int res=0;
        
        for(int i=1;i<=n;i++){
            res+=i;
        }
        
        System.out.println(res);
    }
}


