import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int A1 = Math.abs(A);
        int V = scan.nextInt();
        int B = scan.nextInt();
        int B1 = Math.abs(B);
        int W = scan.nextInt();
        int T = scan.nextInt();
        int sp = V - W;
        double a = Math.signum(A);
        double b = Math.signum(B);
        if(a == b){
            int k = B1 - A1;
            int def = Math.abs(k);
            if(A == B){
                System.out.println("YES");
            }else if(V > W){
                if(sp*T >= def){
                    System.out.println("YES");
                }
            }else{
                System.out.println("NO");
            }
        }else{
            int def = B1 + A1;
            if(A == B){
                System.out.println("YES");
            }else if(V > W){
                if(sp*T >= def){
                    System.out.println("YES");
                }
            }else{
                System.out.println("NO");
            }
        }
        /*
            if(A == B){
                System.out.println("YES");
            }else if(V > W){
                if(sp*T >= def){
                    System.out.println("YES");
                }
            }else{
                System.out.println("NO");
            }
            */
        }
    }