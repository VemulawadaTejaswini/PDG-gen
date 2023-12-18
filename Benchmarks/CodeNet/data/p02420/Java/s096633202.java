import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        while(true){
            
            String str=sc.next();
            
            if(str.equals("-")) break;
        
            int m=sc.nextInt();
        
            for(int i=0;i<m;i++){
            int a=sc.nextInt();
            String str1=str.substring(0,a);
            String str2=str.substring(a);
            str=str2+str1;

            }
            System.out.println(str);
            
        }
        
    }
}
