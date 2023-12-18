import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        for(;i<20000;i++){
            /*
            String str = sc.nextLine();
            String[] str2 = str.split(" ");
            int a = Integer.parseInt(str2[0]);
            String x = str2[1];
            int b = Integer.parseInt(str2[2]);
            */
            int x = sc.nextInt();
            if(x == 0){
                break;
            }
            else{
                System.out.println("Case "+i+": "+x);
            }
            
        }
        
    }
}
