import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        String str=sc.next();
        int n=str.length();
        str=str+"R";
        
        String[] s = str.split("");
        
        boolean rflag=true;
        int j=0;
        
        int ans[] = new int[n];
        
        for(int i=0;i<=n;i++){
            if(rflag&&s[i].equals("L")){
                ans[i]+=(i-j)/2;
                ans[i-1]+=(i-j)/2;
                if((i-j)%2==1){
                    ans[i-1]++;
                }
                j=i;
                rflag=false;
            }else if(!rflag&&s[i].equals("R")){
                ans[j]+=(i-j)/2;
                ans[j-1]+=(i-j)/2;
                if((i-j)%2==1){
                    ans[j]++;
                }
                j=i;
                rflag=true;
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
