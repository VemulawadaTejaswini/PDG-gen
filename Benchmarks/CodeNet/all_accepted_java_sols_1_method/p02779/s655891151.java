import java.util.Scanner;
import java.util.HashSet;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n,flag;
        flag=0;
        n= scan.nextInt();
        HashSet<String>hs = new HashSet<String>();
        for(int i=0;i<n;i++){
            hs.add(scan.next());
        }
        if(n==hs.size()) System.out.printf("YES");
        else System.out.printf("NO");
    }
}