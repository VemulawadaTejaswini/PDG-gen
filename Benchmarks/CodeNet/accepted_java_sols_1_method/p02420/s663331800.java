import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.next();
            if(str.equals("-")) break;
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                int s = sc.nextInt();
                String former = str.substring(0,s);
                String latter = str.substring(s);
                str = latter + former;
            }
            System.out.println(str);
        }
        sc.close();
    }
}
