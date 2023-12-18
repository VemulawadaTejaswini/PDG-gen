import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean flg = false;
        double price;
        price = N/1.08;
        for(int i = 0; i < 50000; i++){
            if(Math.floor(i*1.08) == N){
                System.out.println(i);
                flg = false;
                break;
            }else{
                flg = true;
                continue;
            }
        }
        if(flg){
            System.out.println(":(");
        }
        }
    }