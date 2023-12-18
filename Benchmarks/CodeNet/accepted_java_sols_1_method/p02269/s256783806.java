import java.util.Scanner;
import java.util.HashSet;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        HashSet<String> set = new HashSet<String>();

        String x,y;
        int n = sc.nextInt();
        int i;

        for(i = 0;i < n;i++){
            x = sc.next();
            y = sc.next();

            if(x.equals("insert")){
                set.add(y);
            }

            if(x.equals("find")){
                if(set.contains(y)){
                    System.out.printf("yes\n");
                }else{
                    System.out.printf("no\n");
                }
            }
        }
    }
}
