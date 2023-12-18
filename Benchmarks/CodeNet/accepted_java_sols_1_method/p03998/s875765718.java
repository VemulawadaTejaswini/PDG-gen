import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toUpperCase();
        String b = sc.next().toUpperCase();
        String c = sc.next().toUpperCase();
        List<String> arya = new ArrayList<>(Arrays.asList(a.split("")));
        List<String> aryb = new ArrayList<>(Arrays.asList(b.split("")));
        List<String> aryc = new ArrayList<>(Arrays.asList(c.split("")));
        List<String> tempAry = arya;
        String temp = tempAry.get(0);
        while (temp != null) {
            if (temp.equals("A")) {
                tempAry = arya;
                if (tempAry.size() == 0) {
                    break;
                }
                temp = tempAry.get(0);
                arya.remove(0);
            } else if (temp.equals("B")) {
                tempAry = aryb;
                if (tempAry.size() == 0) {
                    break;
                }
                temp = tempAry.get(0);
                aryb.remove(0);
            } else if (temp.equals("C")) {
                tempAry = aryc;
                if (tempAry.size() == 0) {
                    break;
                }
                temp = tempAry.get(0);
                aryc.remove(0);
            }
        }
        System.out.println(temp);
    }
}