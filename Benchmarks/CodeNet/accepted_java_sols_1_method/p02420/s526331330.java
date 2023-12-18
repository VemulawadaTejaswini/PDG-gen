import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        try(Scanner sc = new Scanner(System.in)){
            while(true){
                String str = sc.next();
                if(str.equals("-")){
                    break;
                }
                int n = sc.nextInt();
                for(int i=0;i<n;i++){
                    int len = sc.nextInt();
                    str = str.substring(len)+ str.substring(0,len);
                }
                System.out.println(str);


            }
        }
    }    
}
