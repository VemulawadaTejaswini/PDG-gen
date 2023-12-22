import java.lang.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int kari = n+1;
        int keta = 1;
        while((int)(kari/10)!=0){
            keta++;
            kari = (int)(kari/10);
        }
        if(keta == 1){
            System.out.println(n);
        }else if(keta == 2){
            System.out.println(9);
        }else if(keta == 3){
            System.out.println((10+n-100));
        }else if(keta == 4){
            System.out.println(909);
        }else if(keta == 5){
            System.out.println((910+n-10000));
        }else{
            System.out.println(90909);
        }
        sc.close();
    }
}