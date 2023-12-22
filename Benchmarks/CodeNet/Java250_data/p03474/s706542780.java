import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        Boolean flag = true;

        for(int i =0;i<s.length();i++){
            if(i==a){
                if(s.charAt(i)!='-'){
                    flag = false;
                }
            }else{
                if(!(s.charAt(i)>=48 && s.charAt(i)<=57)){
                    flag = false;
                }
            }
        }
        
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
