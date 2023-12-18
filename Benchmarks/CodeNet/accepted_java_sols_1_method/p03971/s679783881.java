import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int pass = 0;
        int bc = 0;
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        String s = scan.next();

        String sa[] = s.split("");



        for(int i = 0; i < n; i++) {
            if ("a".equals(sa[i])) {
                if(pass < a+b){
                    System.out.println("Yes");
                    pass++;
                }else{
                    System.out.println("No");
                }
            } else if ("b".equals(sa[i])) {
                bc++;
                if(pass < a+b){
                    if(bc <= b) {
                        System.out.println("Yes");
                        pass++;
                    }else {
                        System.out.println("No");
                    }
                }else{
                    System.out.println("No");
                }
            } else{
                System.out.println("No");
            }
        }
    }
}