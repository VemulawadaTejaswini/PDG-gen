import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int l = sc.nextInt();
                String[] s = new String[n];
                for(int i = 0 ; i < n ; i++){
                        s[i] = sc.next();
                }
                sc.close();
                Arrays.sort(s);
                for(int i = 0 ; i < n - 1 ; i++){
                        System.out.print(s[i]);
                }
                System.out.println(s[n - 1]);
        }
}
//ここに一言添えます
//焼き鳥おいしいですよね