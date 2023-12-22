import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

import java.util.*;
import java.util.stream.LongStream;

public class Main {
    // 標準入力
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 標準入力数値配列用 int
    static int[] inputval() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        int[] intarray = new int[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    /* 標準入力数値配列用 long */
    static long[] inputLongArr() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        long[] longarray = new long[strarray.length];
        for (int i = 0; i < longarray.length; i++) {
            longarray[i] = Long.parseLong(strarray[i]);
        }
        return longarray;
    }

    // 標準入力数値リスト用 int
    static List<Integer> inputIntList() throws Exception {
        List<String> strList = Arrays.asList(br.readLine().trim().split(" "));
        List<Integer> intList = new ArrayList<Integer>();
        for (String elem : strList){
            intList.add(Integer.parseInt(elem));
        }
        return intList;
    }

    // 標準入力数値配列用 integer 降順ソート用
    static Integer[] inputvalInteger() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        Integer[] intarray = new Integer[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    /*標準入力long*/
    static long inputLong() throws Exception {
        return Long.parseLong(br.readLine());
    }

    /*標準入力long*/
    static int inputInt() throws Exception {
        return Integer.parseInt(br.readLine());
    }



    public static void main(String[] args) throws Exception {
        // write your code here
        String s = br.readLine();
        int n = s.length()-1;
        char [] cl = s.toCharArray();
        for(int i=0; i< (Math.pow(2,n)); i++){
            long sum = 0;
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++){
                sb.append(cl[j]);
                if ((1&i>>j) == 1) {
                    sb.append('+');
                }else{
                    sb.append('-');
                }
            }
            sb.append(cl[n]);
            String tmp = sb.toString();
            sum += Long.parseLong(tmp.substring(0,1));
            for(int k = 1; k<tmp.length()-1; k++){
                String val = tmp.substring(k+1,k+2);
                if(tmp.charAt(k) == '+'){
                    sum += Long.parseLong(val);
                }else if(tmp.charAt(k) == '-'){
                    sum -= Long.parseLong(val);
                }
            }
            if (sum == 7){
                System.out.println(tmp + "=7");
                break;
            }

        }




    }

}

