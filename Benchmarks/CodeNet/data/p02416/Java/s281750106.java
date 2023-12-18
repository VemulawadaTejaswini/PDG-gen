import java.util.Scanner;

public class Main{
    public static void main(String[]argc){
        Scanner sc = new Scanner(System.in);
        for(int k=0;;k++){
            int i = 0;
            String str = sc.next();
            int x = Integer.parseInt(str);
            if(x==0) break;
            int l = str.length();
            for(int j=0;j<l;j++){
                char a = str.charAt(j);
                int n = a - '0';
                i+=n;
            }
            System.out.println(i); 
        }
    }
}

                
            
