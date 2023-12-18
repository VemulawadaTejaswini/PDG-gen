import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        long sum=0;
        for(int i=0;i<str.length();i++){
            int num=str.charAt(i)-'0';
            sum+=num;
        }
            
        if(sum%9==0){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }

    }
}