import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String>hs = new HashSet<String>();
        
        for(int i = 0; i < n; i++){
            String command = sc.next();
            if(command.equals("insert")){
                hs.add(sc.next());
            }else{
                if(hs.contains(sc.next())){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }
    }
}
