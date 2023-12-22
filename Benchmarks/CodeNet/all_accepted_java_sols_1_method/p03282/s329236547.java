import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        long k=sc.nextLong();
        if(s.length()>1){
            if(s.charAt(0)=='1'){
                int count=0;
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)!='1'){
                        break;
                    }
                    else{
                        count++;
                    }
                }
                //System.out.println("count="+count);
                if(k>count){
                    System.out.println(s.charAt(count));
                }
                else{
                    System.out.println(s.charAt(0));
                }
            }
            else{
                System.out.println(s.charAt(0));
            }
        }
        else{
            System.out.println(s.charAt(0));
        }
    }    
}