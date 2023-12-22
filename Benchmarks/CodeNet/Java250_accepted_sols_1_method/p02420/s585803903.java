import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int i=0;
        while(!(a.equals("-"))){
            int num = sc.nextInt();
            for(i=0;i<num;i++){
                int n = sc.nextInt();
                String l = a.substring(0,n);
                String r = a.substring(n);
                a = r + l;
            }
            System.out.println(a);
            a = sc.next();
        }
        sc.close();
    }
}
