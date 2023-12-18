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
        int def = B1 - A1;
        int sp = V - W;
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
    }