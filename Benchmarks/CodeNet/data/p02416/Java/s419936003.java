import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(true){
            String n = sc.next();
            if(n.equals("0"))    break;
            long ans=0;
            for(int i=0;i<n.length();i++){
                ans += n.charAt(i) - '0';
            }

            System.out.println(ans);

        }





        sc.close();


    }
}
