import java.util.Scanner;
import java.util.Arrays;
import java.util.StringJoiner;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    
    private static int x = 0;
    private static int y = 0;
    //private static int maxHeight = 0;
    private static int total = 0;
    private static List<Flood> list = new ArrayList<>();
    private static String data = null;
    private static boolean increacing = false;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        data = scanner.nextLine();
        //System.out.println(data);
        for (int length = data.length(); x < length; x++) {
            //System.out.println(data.charAt(x));
            switch (data.charAt(x)) {
            case '\\':
                if (increacing) {
                    //maxHeight = y;  // TODO
                    increacing = false;
                    calc();
                }
                y--;
                break;
                
            case '/' :
                y++;
                increacing = true;
                if (x > 0) {
                    calc();
                }
                break;
            
            case '_':
                
                if (increacing) {
                    increacing = false;
                    calc();
                }
                break;
                
            default:
                // something wrong
                throw new RuntimeException("Unexpected input:" + String.valueOf(data.charAt(x)));
            }
        }
        
        if (increacing) {
            calc();
        }        
        System.out.printf("%d%n%d", total, list.size());
        for (Flood f : list) {
            System.out.printf(" %d", f.area);
        }
        System.out.println();
        
    }
    
    private static void calc() {
        // 戻って計算
        int baseLevel = y; //Math.min(maxHeight, y);
        int curX = x;
        int curY = y;
        
        int area = 0;
        
        //System.out.printf("%d, %d, %d%n", curX, curY, baseLevel);
        
        // while (curY > baseLevel) {
        //     curX--;
        //     curY--;
        //     System.out.printf("skip %d, %d, %d%n", curX, curY, baseLevel);
        // }
        
        do {
            switch (data.charAt(curX - 1)) {
            case '\\':
                curY++;
                area += (baseLevel - curY) * 10 + 5;
                break;
                
            case '/' :
                curY--;
                area += (baseLevel - curY) * 10 - 5;
                break;
            
            case '_':
                area += (baseLevel - curY) * 10;
                break;
                
            default:
                // something wrong
                throw new RuntimeException("Unexpected input:" + String.valueOf(data.charAt(x)));
            }
            curX--;
            //System.out.printf("%d, %d, %d, %d%n", curX, curY, baseLevel, area);

        } while (curY < baseLevel && curX > 0);
        
        if (area > 0 && !(curX == 0 && curY < baseLevel)) {
            Flood f = new Flood();
            f.area = area / 10;
            f.x = x;
            list.add(f);
            total += area / 10;
            //System.out.printf("Add: %d%n", x);

            for (int i = list.size() - 2; i >= 0 ; i--) {
                Flood old = list.get(i);
                //System.out.printf("%d %d : %d%n", i, f.x, curX);
                if (old.x > curX) {
                    list.remove(i);
                    total -= old.area;
                    //System.out.printf("Remove: %d%n", old.x);
                }
            }
        }
	
        //System.out.printf("total: %d%n", total);
    }
    
    private static class Flood {
        int area;
        int x;
    }
}
