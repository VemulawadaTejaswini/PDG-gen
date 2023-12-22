import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<String>() ;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String ord = sc.next();
            String str = sc.next();
            if(ord.equals("insert")){
                set.add(str);
            }
            else {
                if(set.contains(str)) System.out.println("yes");
                else System.out.println("no");
            }

        }

        sc.close();
    }
}

