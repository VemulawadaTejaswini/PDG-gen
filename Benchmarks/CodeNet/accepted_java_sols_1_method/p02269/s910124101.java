import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<String>();
        int num=sc.nextInt();
        String str,si;

        for(int i=0;i<num;i++){
            si=sc.next();
            str=sc.next();
           if(si.equals("insert")){
                set.add(str);
            }else{
                if(set.contains(str)){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }
        sc.close();
    }
}

