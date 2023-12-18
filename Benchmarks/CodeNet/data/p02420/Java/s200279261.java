import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            String str=sc.next();
            if(str.equals("-"))
            break;
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                int length=sc.nextInt();
                str=str.substring(length)+str.substring(0,length); 
            }
            System.out.println(str);
        }
    }
}
