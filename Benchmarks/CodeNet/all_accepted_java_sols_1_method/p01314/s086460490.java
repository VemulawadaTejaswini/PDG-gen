import java.util.Scanner;

/**
 * Created by k-mac on 2014/08/21.
 */
public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int num = s.nextInt();
            if(num==0)break;
            int count=0;
            for (int i=1;i*2<num;i++){
                int sum=0;
                for(int j=i;sum<num;j++){
                    sum+=j;
                    if(sum==num){
                        count++;
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}