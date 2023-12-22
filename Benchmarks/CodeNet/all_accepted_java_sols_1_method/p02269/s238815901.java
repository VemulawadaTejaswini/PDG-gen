import java.util.Scanner;
import java.util.HashSet;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        String x, y;
        n = sc.nextInt();
        HashSet<String> hs = new HashSet<String>();
        for(int i=0;i<n;i++){
            x = sc.next();
            if(x.equals("insert")){
                y = sc.next();
                hs.add(y);
            }else if(x.equals("find")){
                y = sc.next();
                if(hs.contains(y)){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }
    }
}
