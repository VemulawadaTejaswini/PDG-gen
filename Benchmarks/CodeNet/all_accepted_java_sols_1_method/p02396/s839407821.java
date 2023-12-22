import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        String num[]=new String[10001];
        for(int i=0;;i++){
            num[i] =sca.next();
            if(num[i].equals("0"))break;
        }
        for(int i=1;;i++){
            if(num[i-1].equals("0"))break;
            System.out.println("Case "+i+": "+num[i-1]);
        }         
    }   
}