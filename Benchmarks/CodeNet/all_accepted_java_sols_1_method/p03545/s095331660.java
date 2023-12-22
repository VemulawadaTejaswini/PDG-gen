import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here! 
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int[] array = new int[n];
        String s = sc.next();
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        
        for (int op1 = 0; op1 < 2; op1++) {
            int tmp = 0;
            if (op1 == 0) {
                tmp = array[0] + array[1];
            } else {
                tmp = array[0] - array[1];
            }
            for (int op2 = 0; op2 < 2; op2++) {
                int tmp2 = 0;
                if (op2 == 0) {
                    tmp2 += array[2];
                } else {
                    tmp2 -= array[2];
                }
                for (int op3 = 0; op3 < 2; op3++) {
                    int tmp3 = 0;
                    if (op3 == 0) {
                        tmp3 += array[3];
                    } else {
                        tmp3 -= array[3];
                    }
                    
                    if (tmp + tmp2 + tmp3 == 7) {
                        String str = "";
                        str += array[0];
                        if (op1 == 0) {
                            str += "+";
                        } else {
                            str += "-";
                        }
                        str += array[1];
                        if (op2 == 0) {
                            str += "+";
                        } else {
                            str += "-";
                        }
                        str += array[2];
                        if (op3 == 0) {
                            str += "+";
                        } else {
                            str += "-";
                        }
                        str += array[3];
                        str += "=7";
                        System.out.println(str);
                        return;
                    }
                }
            }
        }
    }
}