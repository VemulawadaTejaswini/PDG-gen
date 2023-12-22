import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            String q = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(q.equals("replace")){
                String p = sc.next();
                
                str = str.substring(0,a) + p + str.substring(b+1);
                
            }else if(q.equals("reverse")){
                
                String box = "";
                for(int i2 = b; i2 >= a; i2--){
                    box += str.substring(i2,i2+1);
                }
                str = str.substring(0,a) + box + str.substring(b+1);
            
            }else if(q.equals("print")){
                
                System.out.println(str.substring(a,b+1));
                
            }
        }
    }
}
