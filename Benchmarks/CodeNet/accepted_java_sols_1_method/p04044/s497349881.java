import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        String[] s = new String[101];
        String tmp;
        for(int i=0;i<n;i++){
            s[i] = sc.next();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(s[i].compareTo(s[j])>0){
                    tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(s[i]);
        }
    }
}