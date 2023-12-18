import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sStr = s.next();
        String tStr = s.next();

        int tLength = tStr.length();
        int i = sStr.length() - tLength;
        boolean found = false;
        List<String> goods = new ArrayList<>();
        if (sStr.contains(tStr)) {
            found = true;
            goods.add(sStr);
        } else {
            for (i = sStr.length() - tLength; i >= 0; i--) {
                boolean good = true;
                for (int j = 0; j < tLength; j++) {
                    if (sStr.charAt(j + i) != '?' && sStr.charAt(j + i) != tStr.charAt(j)) {
                        good = false;
                        break;
                    }
                }
                if (good) {
                    found = true;
                    String tmp = sStr.substring(0, i) + tStr + sStr.substring(i + tLength, sStr.length());
                    String a = "";
                    for (int j = 0; j < sStr.length(); j++) {
                        if (tmp.charAt(j) == '?') {
                            a += 'a';
                        } else {
                            a += tmp.charAt(j);
                        }
                    }
                    goods.add(a);

                }
            }
        }
        if (found) {
            Collections.sort(goods);
            sStr = goods.get(0);

            System.out.println(sStr);
        } else {
            System.out.println("UNRESTORABLE");
        }
    }
}