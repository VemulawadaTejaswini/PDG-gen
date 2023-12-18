import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String s = sc.next();
        
        if(c<b){
            if((s.substring(a, c-1).contains("##")) || s.substring(b, d-1).contains("##")){
                System.out.println("No");
                return;
            }
        }else if(c<d){
            if(s.substring(a, d-1).contains("##")){
                System.out.println("No");
                return;
            }
        }else{
            if(s.substring(a, c-1).contains("##")){
                System.out.println("No");
                return;
            }else if(!s.substring(b-2, d+1).contains("...")){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}