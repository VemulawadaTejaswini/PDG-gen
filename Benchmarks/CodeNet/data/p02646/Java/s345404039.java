import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int V = scan.nextInt();
        int B = scan.nextInt();
        int W = scan.nextInt();
        int T = scan.nextInt();
        String anc = "NO";
            if(((V-W)*T) >= Math.abs(B-A)){
                    anc = "YES";
            }
        System.out.println(anc);
        }
    }