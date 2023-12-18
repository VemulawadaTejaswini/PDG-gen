import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            //データ受取
            String line = sc.nextLine();

            //終了条件
            if(line.equals("0"))    break;

            int number;
            int sum = 0;

            //一文字ずつ処理
            for(int i = 0;i < line.length();i++){
                number = Character.getNumericValue(line.charAt(i));
                sum += number;
            }
            System.out.println(sum);
        }
    }
}
