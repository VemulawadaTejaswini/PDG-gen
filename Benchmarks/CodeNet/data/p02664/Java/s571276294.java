import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] T = sc.next().split("");
        String indexList = "";
        for (int i = 0; i < T.length; i++) {
            if (T[i].equals("?")) indexList += i;
        }

        String maxT = "";
        int indexDPD = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < indexList.length(); j++) {
                int ind = Character.getNumericValue(indexList.charAt(j));
                T[ind] = (Math.random() > 0.5)? "P" : "D";
            }
            String nowT = "";
            for (String t:
                 T) {
                nowT += t;
            }
            int D = nowT.length() - nowT.replace("D"+"","").length();
            int PD = nowT.length() - nowT.replace("PD"+"","").length();
            if (indexDPD < (D+PD)) {
                indexDPD = D+PD;
                maxT = nowT;
            }
        }
        System.out.println(maxT);
    }
}