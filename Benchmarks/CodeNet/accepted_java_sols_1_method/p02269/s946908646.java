import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<String> l = new HashSet<String>();

        for(int i = 0; i < n; i++){
            String output = scanner.next();
            if(output.equals("insert")){
                l.add(scanner.next());
            }else{
                if(l.contains(scanner.next())){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }
    }
}

