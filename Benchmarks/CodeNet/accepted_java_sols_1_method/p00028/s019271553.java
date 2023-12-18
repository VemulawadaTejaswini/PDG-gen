import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> allNum = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();
        List<Integer> modeFound = new ArrayList<>();
        final int MAX = 100;
        int curNum = 0, maxRep = 0;
        boolean flag = false;
        
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            allNum.add(scan.nextInt());
            curNum ++;
            if (curNum >= MAX) {
                break;
            }
        }
        
        for (int i=0; i<allNum.size(); i++) {
            flag = false;
            for (int j=0; j<counts.size(); j+=2) {
                if (allNum.get(i) == counts.get(j)) {
                    counts.set(j+1,counts.get(j+1)+1);
                    flag = true;
                }
            }
            if (!flag) {
                counts.add(allNum.get(i));
                counts.add(1);
            }
        }
        
        for (int i=0; i<counts.size(); i+=2) {
            if (counts.get(i+1) > maxRep)
                maxRep = counts.get(i+1);
        }
        
        for (int i=0; i<counts.size(); i+=2) {
            if (counts.get(i+1) == maxRep) {
                flag = false;
                for (int j=0; j<modeFound.size(); j++) {
                    if (modeFound.get(j) > counts.get(i)) {
                        modeFound.add(j,counts.get(i));
                        flag = true;
                        break;
                    }
                }
                if (!flag)
                    modeFound.add(counts.get(i));
            }
        }
        
        for (int i=0; i<modeFound.size(); i++) {
            System.out.println(modeFound.get(i) + "");
        }
    }
}