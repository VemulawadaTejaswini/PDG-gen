import java.util.Scanner;
  
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        int sum;
        
        while(true){
            sum=0;
            str = sc.next();
            for(int i=0;i<str.length();i++){
                sum += str.charAt(i)-'0';
            }
            if(sum==0) break;
            System.out.println(sum);
        } 
    }
}