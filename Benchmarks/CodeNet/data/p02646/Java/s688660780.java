import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int V = scan.nextInt();
        int B = scan.nextInt();
        int W = scan.nextInt();
        int T = scan.nextInt();
        int def = B - A;
        int sp = V - W;
            if(V > W){
                if(sp*V >= def){
                    System.out.println("YES");
                }
            }
            else{
                System.out.println("NO");
            }
        }
    }