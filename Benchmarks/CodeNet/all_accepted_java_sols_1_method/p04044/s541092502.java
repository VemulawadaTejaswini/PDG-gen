import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), l=sc.nextInt(), i, j;
        String[] s = new String[101];
        String tmp;
        for(i=0;i<n;i++)
            s[i] = sc.next();
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(s[i].compareTo(s[j])>0){
                    tmp = s[i];
                    s[i] = s[j];
                    s[j] = tmp;
                }
            }
        }
        for(i=0;i<n;i++)
            System.out.print(s[i]);
        System.out.println();
    }
}
