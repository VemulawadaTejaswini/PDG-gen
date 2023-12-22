import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();	//入力
        int sumt= 0;
        int sumh =0;
        
        //-が入力されたらbreak
        for(int i=0; i<num; i++) {

            String taro = scan.next();	//動物名の入力
            String hana = scan.next();	//動物名の入力
            
            if(taro.compareTo(hana) < hana.compareTo(taro)) {
            	
            	sumh += 3;
            	
            }else if(taro.compareTo(hana) > hana.compareTo(taro)){
            	
            	sumt += 3;
            	
            }else if(taro.compareTo(hana) == hana.compareTo(taro)) {
            	
            	sumh += 1;
            	sumt += 1;
            	
            }
        }
        
        System.out.println(String.format("%d %d",sumt, sumh));
    }
}
