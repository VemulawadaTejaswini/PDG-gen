
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            //count???????????§???????????°???upStatus???????????°????????????????¶??????°???times????¶??????????????????°
            int count = 0, upStatus = 0, times = sc.nextInt();
            //0?????\???????????????break??????
            if (times == 0) {
                break;
            }
            for (int i = 0; i < times; i++) {
                //?¶?????????????String
                String legAction=sc.next();
                //?¶????????????????????????????????????£?????´??????upStatus???1????¶????/????????§????????´??????upStatus??????1?????????
                upStatus = (legAction.equals("lu") || legAction.equals("ru")) ? upStatus + 1 : upStatus - 1;
                /*????????°????????§???????????°?????¶??°???????????°?????????????????¶???/?\???°???????????°?????????????????¶???
                 ????????°?????????????????¶?????§?????£???????????????????¶????????????°??????????????£???????????????????????????1?????????*/
                if ((count % 2 == 0 && upStatus == 2)|| (count % 2 == 1 && upStatus == 0)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}