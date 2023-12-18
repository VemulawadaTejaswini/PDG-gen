import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Map;
import java.util.TreeMap;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_8_C
 * 
 * @author eitatsuro
 * 
 */
public class Main {
    
    public static void main(String[] args) {
        try {
            LineNumberReader lineNumReader = new LineNumberReader(
                    new InputStreamReader(System.in));
            
            // ??¢?????????????????????????????????????????°??????????????????
            Map<String, Integer> outputTreeMap = new TreeMap<String, Integer>();
            
            // ??????????????????.
            outputTreeMap.put("a", Integer.valueOf(0));
            outputTreeMap.put("b", Integer.valueOf(0));
            outputTreeMap.put("c", Integer.valueOf(0));
            outputTreeMap.put("d", Integer.valueOf(0));
            outputTreeMap.put("e", Integer.valueOf(0));
            outputTreeMap.put("f", Integer.valueOf(0));
            outputTreeMap.put("g", Integer.valueOf(0));
            outputTreeMap.put("h", Integer.valueOf(0));
            outputTreeMap.put("i", Integer.valueOf(0));
            outputTreeMap.put("j", Integer.valueOf(0));
            outputTreeMap.put("k", Integer.valueOf(0));
            outputTreeMap.put("l", Integer.valueOf(0));
            outputTreeMap.put("m", Integer.valueOf(0));
            outputTreeMap.put("n", Integer.valueOf(0));
            outputTreeMap.put("o", Integer.valueOf(0));
            outputTreeMap.put("p", Integer.valueOf(0));
            outputTreeMap.put("q", Integer.valueOf(0));
            outputTreeMap.put("r", Integer.valueOf(0));
            outputTreeMap.put("s", Integer.valueOf(0));
            outputTreeMap.put("t", Integer.valueOf(0));
            outputTreeMap.put("u", Integer.valueOf(0));
            outputTreeMap.put("v", Integer.valueOf(0));
            outputTreeMap.put("w", Integer.valueOf(0));
            outputTreeMap.put("x", Integer.valueOf(0));
            outputTreeMap.put("y", Integer.valueOf(0));
            outputTreeMap.put("z", Integer.valueOf(0));
            
            String inputStr = null;
            char temp;
            
            while ((inputStr = lineNumReader.readLine()) != null) {
                
                // ??????????°?????????§??±???.
                inputStr = inputStr.toLowerCase();
                for (int i = 0; i < inputStr.length(); i++) {
                    temp = inputStr.charAt(i);
                    
                    int plusOne = 0;
                    switch (temp) {
                        case 'a':
                            plusOne = outputTreeMap.get("a").intValue() + 1;
                            outputTreeMap.put("a", plusOne);
                            break;
                        case 'b':
                            plusOne = outputTreeMap.get("b").intValue() + 1;
                            outputTreeMap.put("b", plusOne);
                            break;
                        case 'c':
                            plusOne = outputTreeMap.get("c").intValue() + 1;
                            outputTreeMap.put("c", plusOne);
                            break;
                        case 'd':
                            plusOne = outputTreeMap.get("d").intValue() + 1;
                            outputTreeMap.put("d", plusOne);
                            break;
                        case 'e':
                            plusOne = outputTreeMap.get("e").intValue() + 1;
                            outputTreeMap.put("e", plusOne);
                            break;
                        case 'f':
                            plusOne = outputTreeMap.get("f").intValue() + 1;
                            outputTreeMap.put("f", plusOne);
                            break;
                        case 'g':
                            plusOne = outputTreeMap.get("g").intValue() + 1;
                            outputTreeMap.put("g", plusOne);
                            break;
                        case 'h':
                            plusOne = outputTreeMap.get("h").intValue() + 1;
                            outputTreeMap.put("h", plusOne);
                            break;
                        case 'i':
                            plusOne = outputTreeMap.get("i").intValue() + 1;
                            outputTreeMap.put("i", plusOne);
                            break;
                        case 'j':
                            plusOne = outputTreeMap.get("j").intValue() + 1;
                            outputTreeMap.put("j", plusOne);
                            break;
                        case 'k':
                            plusOne = outputTreeMap.get("k").intValue() + 1;
                            outputTreeMap.put("k", plusOne);
                            break;
                        case 'l':
                            plusOne = outputTreeMap.get("l").intValue() + 1;
                            outputTreeMap.put("l", plusOne);
                            break;
                        case 'm':
                            plusOne = outputTreeMap.get("m").intValue() + 1;
                            outputTreeMap.put("m", plusOne);
                            break;
                        case 'n':
                            plusOne = outputTreeMap.get("n").intValue() + 1;
                            outputTreeMap.put("n", plusOne);
                            break;
                        case 'o':
                            plusOne = outputTreeMap.get("o").intValue() + 1;
                            outputTreeMap.put("o", plusOne);
                            break;
                        case 'p':
                            plusOne = outputTreeMap.get("p").intValue() + 1;
                            outputTreeMap.put("p", plusOne);
                            break;
                        case 'q':
                            plusOne = outputTreeMap.get("q").intValue() + 1;
                            outputTreeMap.put("q", plusOne);
                            break;
                        case 'r':
                            plusOne = outputTreeMap.get("r").intValue() + 1;
                            outputTreeMap.put("r", plusOne);
                            break;
                        case 's':
                            plusOne = outputTreeMap.get("s").intValue() + 1;
                            outputTreeMap.put("s", plusOne);
                            break;
                        case 't':
                            plusOne = outputTreeMap.get("t").intValue() + 1;
                            outputTreeMap.put("t", plusOne);
                            break;
                        case 'u':
                            plusOne = outputTreeMap.get("u").intValue() + 1;
                            outputTreeMap.put("u", plusOne);
                            break;
                        case 'v':
                            plusOne = outputTreeMap.get("v").intValue() + 1;
                            outputTreeMap.put("v", plusOne);
                            break;
                        case 'w':
                            plusOne = outputTreeMap.get("w").intValue() + 1;
                            outputTreeMap.put("w", plusOne);
                            break;
                        case 'x':
                            plusOne = outputTreeMap.get("x").intValue() + 1;
                            outputTreeMap.put("x", plusOne);
                            break;
                        case 'y':
                            plusOne = outputTreeMap.get("y").intValue() + 1;
                            outputTreeMap.put("y", plusOne);
                            break;
                        case 'z':
                            plusOne = outputTreeMap.get("z").intValue() + 1;
                            outputTreeMap.put("z", plusOne);
                            break;
                        default:
                            break;
                    }
                }
                // ??¢???????????????
                for (String key : outputTreeMap.keySet()) {
                    System.out.println(key + " : "
                            + outputTreeMap.get(key).intValue());
                }
            }
            

            
            lineNumReader.close();
        } catch (Exception e) {
            System.exit(-1);
        }
        
    }
}