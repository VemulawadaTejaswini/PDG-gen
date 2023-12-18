import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

class Main {
    public static void main(String[] args) throws ScriptException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int[] l = new int[4];
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                l[i] = sc.nextInt();
                sum += l[i];
            }
            if (sum == 0) {
                break;
            }
            System.out.println(c(l));
        }
    }

    static boolean check(String s) throws ScriptException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("Nashorn");
        engine.eval("var a=" + s);
        return String.valueOf(engine.get("a")).equals("10");
    }

    static String c(int[] l) throws ScriptException {
        String[] list = { "+", "-", "*" };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    String s=c2(l, list[i], list[j], list[k]);
                    if(!s.equals("0")) {
                        return s; 
                    }
                }
            }
        }
        return "0";
    }

    static String c2(int[] l, String a, String b, String c) throws ScriptException {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < 4; k++) {
                    if (i == k || j == k) {
                        continue;
                    }
                    for (int n = 0; n < 4; n++) {
                        if (i == n || j == n || k == n) {
                            continue;
                        }
                        String s=c3(l[i] + a, l[j], b, l[k], c + l[n]);
                        if(!s.equals("0")) {
                            return s; 
                        }
                    }
                }
            }
        }
        return "0";
    }

    static String c3(String a, int b, String c, int d, String e) throws ScriptException {
        String[] t = { "(" + a + b + ")" + c + d + e,
                a + "(" + b + c + d + ")" + e,
                a + b + c + "(" + d + e + ")",
                "(" + a + b + c + d + ")" + e,
                a + "(" + b + c + d + e + ")",
                "(" + a + b + ")" + c + "(" + d + e + ")",
                "((" + a + b + ")" + c + d + ")" + e,
                "(" + a + "(" + b + c + d + "))" + e,
                a + "((" + b + c + d + ")" + e + ")",
                a + "(" + b + c + "(" + d + e + "))" };

        for (String s : t) {
            if (check(s)) {
                return s;
            }
        }
        return "0";
    }
}
