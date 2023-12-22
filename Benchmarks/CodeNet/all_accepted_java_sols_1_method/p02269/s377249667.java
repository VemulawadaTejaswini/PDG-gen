import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<String> st=new HashSet<String>();
        String[] ans=new String[n];
        for(int i=0;i<n;i++){
            String s=sc.next();
            String t=sc.next();
            if(s.equals("insert")){
                st.add(t);
            }else{
                if(st.contains(t)){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }
    }
}
