import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        
        boolean flag =true;
        
        for(int i=0; i < a.length();i++) {
            char c = a.charAt(i);
            if(c=='U' || c=='D' ) continue;
            if(i%2 == 0 && c!='R') {
                System.out.println("No");
                flag=false;
                break;
            }
            else if (i%2!=0 && c!='L') {
                System.out.println("No");
                flag=false;
                break;
            }
        
        }
        if(flag){
            System.out.println("Yes");
            
        }
       
    }
}