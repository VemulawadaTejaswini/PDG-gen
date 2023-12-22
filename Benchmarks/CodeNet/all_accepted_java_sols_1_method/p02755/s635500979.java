
import java.util.Scanner;

public class Main {
    public static void main(String[] a){
        Scanner scanner=new Scanner(System.in);
        //int t=scanner.nextInt();
//        String string=scanner.next();
//        int aa=0,b=0;
//        for(int j=0;j<string.length();j++){
//            if(string.charAt(j)=='A'){
//                aa++;
//            }
//            else{
//                b++;
//            }
//        }
//        if(aa==0 || b==0){
//            System.out.println("No");
//        }
//        else{
//            System.out.println("Yes");
//        }
       // int n=scanner.nextInt();
        double aa=scanner.nextDouble();
        double b=scanner.nextDouble();
        int ans=-1;
        for(int j=1;j<=1333;j++){
            double ss=(double)Math.floor(0.08*(double)j);
            double ff=(double)((double)Math.floor(0.10*(double)(double)j));
            if(ss==aa && ff==b){
                ans=(int)j;
                break;
            }
        }
        System.out.println(ans);
//        if(ss>ff){
//            System.out.println(ff);
//        }
//        else{
//            System.out.println(-1);
//        }
    }
}
