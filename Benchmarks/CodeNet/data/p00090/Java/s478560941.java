00.07 sec    20600 KB    90 lines     2654 bytes    2013-03-05 19:22
?
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class Main {
    public static void main(String[] args) throws IOException {
        Main instance = new Main();
        instance.execute();
    }
     
    private void execute() throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
         
        while(true) {
            int rows = Integer.parseInt(sc.readLine());
            if(rows == 0){break;}
             
            Map<Integer, List<Integer>> cross = calculateCross(toDataArray(sc, rows));
            int result = 0;
            for(Integer num : cross.keySet()) {
                result = Math.max(result, countCrossover(cross, cross.get(num), 1));
            }
             
            System.out.println(result);
        }
    }
     
    /**
     * BufferReaderから取得した座標情報を2次元配列に変換する
     */
    private double[][] toDataArray(BufferedReader sc, int rows) throws IOException {
        double[][] dataArray = new double[rows][2];
         
        String[] line;
        for(int i = 0 ; i < rows ; i++) {
            line = sc.readLine().split(",");
            dataArray[i][0] = Double.parseDouble(line[0]);
            dataArray[i][1] = Double.parseDouble(line[1]);
        }
        return dataArray;
    }
 
    /**
     * 座標情報（2次元配列）から、シールの重なり状態を示すMapを生成する
     * {シール番号, [座標が重なるシール番号]}
     */
    private Map<Integer, List<Integer>> calculateCross(double[][] dataArray) {
        Map<Integer, List<Integer>> cross = new HashMap<Integer, List<Integer>>();
         
        List<Integer> result;
        for(int i = 0 ; i < dataArray.length ; i++) {
            result = new ArrayList<Integer>();
            for(int j = i + 1 ; j < dataArray.length ; j++) {
                // x座標,y座標の各距離の二乗の和が4以下なら、シールが重なっていると判断
                if(Math.pow(dataArray[i][0] - dataArray[j][0], 2) + 
                   Math.pow(dataArray[i][1] - dataArray[j][1], 2) <= 4) {
                    result.add(j);
                }
            }
            cross.put(i, result);
        }
         
        return cross;
    }
     
    /**
     * シールの重なり状態を示すMapから、最大の重なり枚数を計算する
     */
    private int countCrossover(Map<Integer, List<Integer>> cross, List<Integer> currentCross, int currentCount) {
        int result = currentCount;
        List<Integer> target;
        List<Integer> nextCross;
         
        for(Integer num : currentCross) {
            target = cross.get(num);
            nextCross = new ArrayList<Integer>();
            nextCross.addAll(target);
            nextCross.retainAll(currentCross);
            target.removeAll(currentCross);
 
            result = Math.max(result, countCrossover(cross, nextCross, currentCount + 1));
        }
        return result;
    }
}