import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.next();
            if(str.equals("-")){
                break;
            }
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                int r = sc.nextInt();
                String x = str.substring(0,r);
                String y = str.substring(r);
                str = y+x;
            }
            System.out.println(str);
            }
        sc.close();
        }    
    }

     
