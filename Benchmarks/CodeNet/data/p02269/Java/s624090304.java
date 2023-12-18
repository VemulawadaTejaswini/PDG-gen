import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        HashSet<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            String command = sc.next();
            switch (command) {
                case "insert":
                    set.add(sc.next());
                    break;
                case "find":
                    if(set.contains(sc.next())){
                        sb.append("yes").append(System.lineSeparator());
                    }else{
                        sb.append("no").append(System.lineSeparator());
                    }
                    break;
            }
        }
        
        System.out.print(sb);
    }
}
