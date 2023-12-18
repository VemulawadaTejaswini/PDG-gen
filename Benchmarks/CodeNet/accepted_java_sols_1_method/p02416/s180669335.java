import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String str = sc.nextLine();//先にstring変換

            if(str.equals("0")){//0の時ここ大事んご
                break;
            }
            
            else{
                int sum = 0;

                for(int i = 0; i < str.length(); i++){
                    sum += Character.getNumericValue(str.charAt(i));
                }
                System.out.println(sum);
            }
        }
        sc.close();
    }
}
