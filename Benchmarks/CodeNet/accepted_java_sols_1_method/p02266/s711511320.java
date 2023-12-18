import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = br.readLine();
            int[] height = new int[line.length() + 1];
            height[0] = 0;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '\\') {
                    height[i + 1] = height[i] - 1;
                } else if (line.charAt(i) == '/') {
                    height[i + 1] = height[i] + 1;
                } else {
                    height[i + 1] = height[i];
                }
            }

            ArrayList<Integer> pondsArea = new ArrayList<>();
            double area = 0.0;
            double areaTotal = 0.0;
            int numberPonds = 0;
            int startPos = 0;
            int maxPos;
            int minHeight;
            int maxHeight;
            int endPos = 0;
            int level = 0;
            boolean hasPond;
            loop : while (startPos < height.length - 1) {
                hasPond = false;
                minHeight = height[startPos];
                maxHeight = -20001;
                maxPos = startPos;

                search: for (int i = startPos + 1; i < height.length; i++) {
                    minHeight = Math.min(minHeight, height[i]);
                    if (height[i] > height[i - 1] && maxHeight < height[i]) {
                        maxPos = i;
                        maxHeight = Math.max(maxHeight, height[i]);

                    }
                    if (height[startPos] <= height[i]) {
                        endPos = i;
                        if (height[startPos] > minHeight && height[endPos] > minHeight) {
                            hasPond = true;
                            numberPonds++;
                            level = height[endPos];
                            break;
                        } else {
                            startPos++;
                            break;
                        }
                    } else if (i == height.length - 1) {
                        for (int j = startPos ; j < maxPos; j++) {
                            if(height[j]==height[maxPos]){
                                level = height[maxPos];
                                hasPond=true;
                                numberPonds++;
                                startPos=j;
                                endPos=maxPos;
                                break search;
                            }
                        }
                        break loop;
                    }
                }

                if (hasPond) {
                    for (int i = startPos; i < endPos; i++) {
                        double a = level > height[i] ? level - height[i] : 0;
                        double b = level > height[i + 1] ? level - height[i + 1] : 0;
                        area += (a + b) / 2;
                    }
                    pondsArea.add((int) area);
                    areaTotal += area;
                    area = 0;
                    startPos = endPos;
                }
            }

            System.out.println((int) areaTotal);
            System.out.print(numberPonds);
            if (pondsArea.size() > 0) {
                for (Integer integer : pondsArea) {
                    System.out.print(" " + integer);
                }
            }
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}