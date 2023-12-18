
import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);//XLipÌÏ
    static double time_of_500m, time_of_1000m;//^Cði[·éÏ
    public static void main(String[] args) {
        while(sc.hasNextDouble()){//Ìsª éÈçÇÝæèÆ»èðÀs
            read();//ÇÝæè
            slove();//»è
        }
    }
    static boolean read(){
        time_of_500m = sc.nextDouble();//ÇÝæè
        time_of_1000m = sc.nextDouble();//ÇÝæè
        return true;
    }
    static void slove(){
        //System.out.println(time_of_500m);fobOpÈÌÅCÉµÈ¢Å­¾³¢
        //System.out.println(time_of_1000m);fobOpÈÌÅCÉµÈ¢Å­¾³¢
        //±±©çÍüÍÉÎµÄif¶Åðð»èµÄ¢Ü·B
        if(time_of_500m < 35.5 && time_of_1000m < 71.0){
            System.out.println("AAA");
        }else if(time_of_500m < 37.5 && time_of_1000m < 77.0){
            System.out.println("AA");
        }else if(time_of_500m < 40.0 && time_of_1000m < 83.0){
            System.out.println("A");
        }else if(time_of_500m < 43.0 && time_of_1000m < 89.0){
            System.out.println("B");
        }else if(time_of_500m < 50.0 && time_of_1000m < 105.0){
            System.out.println("C");
        }else if(time_of_500m < 55.0 && time_of_1000m < 116.0){
            System.out.println("D");
        }else if(time_of_500m < 70.0 && time_of_1000m < 148.0){
            System.out.println("E");
        }else{
            System.out.println("NA");
        }
    }
}