import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        //ツ禿シツ療債つウツづェツつスツ値ツつェdoubleツづ個づ?つォ
        //ツ禿シツ療債つウツづェツつスツ値ツづーツ板シツ径ツづ?つオツつスツ円ツづ個姪環静渉づ?円ツ偲シツづーツ出ツ療債つキツづゥ
        if(sc.hasNextDouble()){
            double r = sc.nextDouble();
            double menseki = Math.PI * r * r;
            double ensyuu = Math.PI * r * 2;
             
            System.out.printf("%.6f %.6fn", menseki, ensyuu);
        }
    }
}