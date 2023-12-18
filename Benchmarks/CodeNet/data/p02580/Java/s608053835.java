import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lines = line.split(" ", 0);
        int height = Integer.parseInt(lines[0]);
        int width = Integer.parseInt(lines[1]);
        int numobj = Integer.parseInt(lines[2]);

        
        int[] heightNumber = new int[numobj];
        int[] widthNumber = new int[numobj];
        
        int[] heightNum = new int[height];
        int[] widthNum = new int[width];
        int maxHeight = 0;
        int maxWidth = 0;
        
        for (int i = 0; i < numobj; i++) {
            line = sc.nextLine();
            lines = line.split(" ", 0);

            int posH = Integer.parseInt(lines[0]);
            int posW = Integer.parseInt(lines[1]);
            heightNum[posH-1]++;
            widthNum[posW-1]++;
            heightNumber[i] = posH-1;
            widthNumber[i] = posW-1;
            if (maxHeight < heightNum[posH-1]) {
                maxHeight = heightNum[posH-1];
            }
            if (maxWidth < widthNum[posW-1]) {
                maxWidth = widthNum[posW-1];
            }
        }

        ArrayList<Integer> maxHeightList = new ArrayList<>();
        ArrayList<Integer> maxWidthList = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            if (heightNum[i] == maxHeight) {
                maxHeightList.add(i);
            }
        }
        for (int i = 0; i < width; i++) {
            if (widthNum[i] == maxWidth) {
                maxWidthList.add(i);
            }
        }

        int count = 0;
        for (int i = 0; i < numobj; i++) {
            if (maxHeightList.contains(heightNumber[i]) && maxWidthList.contains(widthNumber[i])) {
//                System.out.printf("H:%d W:%d\n",heightNumber[i],widthNumber[i]);
                count++;
            }
        }
        boolean exist = (maxHeightList.size() * maxWidthList.size() != count);
        
        int ret = maxHeight + maxWidth + (exist ? 0 : -1);
        
        System.out.println(ret);
    }
}
