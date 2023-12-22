import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        String[] C = S.split("");
        String I1 = C[0] + C[1];
        String I2 = C[2] + C[3];
        int N1 = Integer.parseInt(I1);
        int N2 = Integer.parseInt(I2);
        String ans;
        if(N1 != 00 && N2 != 00){
            if(N1 <= 12){
                ans = (N2<=12)? "AMBIGUOUS" : "MMYY";
            }
            else{
                ans = (N2<=12)? "YYMM":"NA";
            }
        }
        else if(N1==00) {
            ans = (N2<=12 && N2 > 0)? "YYMM":"NA";
        }
        else if(N2==00){
            ans = (N1<=12 && N1 > 0)? "MMYY":"NA";
        }
        else {ans = "NA";}
        System.out.print(ans);
    }
}