import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //入力を受け取る
        int X = sc.nextInt();
        
        //下2桁を取り出す
        double get_1 = X/10.0/10.0;
        double get_2 = get_1 - Math.floor(get_1);
        int get_3 = (int)(Math.round(get_2*10*10));
        
        //下２桁を作るのに必要な商品の個数
        int count_105 = (int)(get_3/5);
        int countOther = get_3%5;
        if(countOther!=0) {
        	countOther += 100;
        }
        
        if(X>=105*count_105+countOther) {
        	System.out.println(1);
        }else {
        	System.out.println(0);
        }
    }
}