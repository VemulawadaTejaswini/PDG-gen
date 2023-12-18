import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int sum=0,i=0,j;
        String t;
        Scanner s = new Scanner(System.in);
        while(true){
            t = s.next();
            if(t.charAt(0) =='0'&&t.length()==1)break;
            for(i=0;i<t.length();i++){
                sum+=t.charAt(i)-'0';
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
