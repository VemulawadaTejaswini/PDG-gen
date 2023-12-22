import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = new Integer(sc.nextLine());
        String[] str = sc.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(int i=n-1;i>=0;i--){
            sb.append(str[i]);
            if(i!=0) sb.append(" ");
        }
        System.out.println(sb);
    }
}
