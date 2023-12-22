import java.util.Scanner;

public class Main {

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);

        String[] params = in.nextLine().split(" ");
        double w = Double.parseDouble(params[0]);
        double h = Double.parseDouble(params[1]);
        double x = Double.parseDouble(params[2]);
        double y = Double.parseDouble(params[3]);


        // 直線上にある場合　面積の半分＋0
        if( x == 0 || y == 0 || x == w || y == h ){
            System.out.println( ( String.format("%.6f", w * h / 2 )) + " 0" );
            return;
        }

        // 図の中心にある場合　面積の半分+1
        if( w / 2 == x && h / 2 == y ){
            System.out.println( ( String.format("%.6f", w * h / 2 )) + " 1");
            return;
        }

        // 対角線上にある場合　面積の半分＋0
        if( h / w == y / x ){
            System.out.println( ( String.format("%.6f", w * h / 2 )) + " 0");
            return;
        }
        if( h/w == (y-h) / -x ){
            System.out.println( ( String.format("%.6f", w * h / 2 )) + " 0");
            return;
        }

//        // h/2==yの場合　面積の半分＋1
//        if( h/2 == y){
//            System.out.println( ( String.format("%.6f", w * h / 2 )) + " 1");
//            return;
//        }
//
//        // w/2==xの場合　面積の半分+1
//        if( w/2 == x){
//            System.out.println( ( String.format("%.6f", w * h / 2 )) + " 1");
//            return;
//        }

        // 上記以外は面積の半分+0
        System.out.println( ( String.format("%.6f", w * h / 2 )) + " 0");
        return;

    }
}