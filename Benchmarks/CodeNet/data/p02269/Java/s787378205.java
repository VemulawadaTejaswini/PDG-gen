import java.util.HashSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String>hs = new HashSet<String>();
        for(int i=0;i<n;i++){
            String order = sc.next();
            if(order.equals("insert")){
                String str = sc.next();
                hs.add(str);
            }else{
                String str = sc.next();
                if(hs.contains(str)){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }
        sc.close();
    }
}
