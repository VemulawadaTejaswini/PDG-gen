import java.util.Scanner;
  
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str,ans_str;
        int n = sc.nextInt();
        
        ans_str = sc.next();
        
        for(int i=1;i<n;i++){
            str = sc.next();
            if(str.compareTo(ans_str)<0) ans_str = str;
        }
        
        System.out.println(ans_str);
    }
}