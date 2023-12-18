import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        while(true){
            String moji = sc.next();
            if(moji.equals("-"))    break;
            int m = sc.nextInt();

            for(int i=0;i<m;i++){
                int h = sc.nextInt();
                moji = moji.substring(h,moji.length()) + moji.substring(0,h);

            }
            System.out.println(moji);
        }
        sc.close();
    }
}
