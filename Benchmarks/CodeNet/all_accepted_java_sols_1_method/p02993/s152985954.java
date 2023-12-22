import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        sc.close();
        boolean judge=true;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                judge=false;
                break;
            }
        }
        if(judge){
            System.out.println("Good");
        }else{
            System.out.println("Bad");
        }
    }
}