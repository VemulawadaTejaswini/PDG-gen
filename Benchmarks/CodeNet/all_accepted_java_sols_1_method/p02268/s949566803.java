import java.util.Scanner;
import java.util.TreeSet;
public class Main {
 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        TreeSet<Integer> st = new TreeSet<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int b=sc.nextInt();
            st.add(b);
        }
        int q=sc.nextInt();
        int ans=0;
        for(int i=0;i<q;i++){
        int c=sc.nextInt();
        if(st.contains(c)) ans++; 
        }
        System.out.println(ans);
        sc.close();
      
    }
}

