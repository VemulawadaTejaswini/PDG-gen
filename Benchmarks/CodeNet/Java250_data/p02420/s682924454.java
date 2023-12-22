import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
        String a = sc.next();
        if(a.equals("-")){
                break;
            }
        int b = sc.nextInt();
        int i = 0;
        String a1, a2;
        
        
        for (i = 0; i < b; i++) {
            int c= sc.nextInt();

            
            
            a1=a.substring(0,c);
            a2=a.substring(c);
             a=a2+a1;
        }
        
        System.out.println(a);
    }
        sc.close();
    }

}
