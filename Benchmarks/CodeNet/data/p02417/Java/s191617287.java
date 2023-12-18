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
            outputTreeMap.put("A", Integer.valueOf(0));
            outputTreeMap.put("B", Integer.valueOf(0));
            outputTreeMap.put("C", Integer.valueOf(0));
            outputTreeMap.put("D", Integer.valueOf(0));
            outputTreeMap.put("E", Integer.valueOf(0));
            outputTreeMap.put("F", Integer.valueOf(0));
            outputTreeMap.put("G", Integer.valueOf(0));
            outputTreeMap.put("H", Integer.valueOf(0));
            outputTreeMap.put("I", Integer.valueOf(0));
            outputTreeMap.put("J", Integer.valueOf(0));
            outputTreeMap.put("K", Integer.valueOf(0));
            outputTreeMap.put("L", Integer.valueOf(0));
            outputTreeMap.put("M", Integer.valueOf(0));
            outputTreeMap.put("N", Integer.valueOf(0));
            outputTreeMap.put("O", Integer.valueOf(0));
            outputTreeMap.put("P", Integer.valueOf(0));
            outputTreeMap.put("Q", Integer.valueOf(0));
            outputTreeMap.put("R", Integer.valueOf(0));
            outputTreeMap.put("S", Integer.valueOf(0));
            outputTreeMap.put("T", Integer.valueOf(0));
            outputTreeMap.put("U", Integer.valueOf(0));
            outputTreeMap.put("V", Integer.valueOf(0));
            outputTreeMap.put("W", Integer.valueOf(0));
            outputTreeMap.put("X", Integer.valueOf(0));
            outputTreeMap.put("Y", Integer.valueOf(0));
            outputTreeMap.put("Z", Integer.valueOf(0));
            
            String inputStr = null;
            char temp;
            
            while ((inputStr = lineNumReader.readLine()) != null) {
                
                // ???????????§????????§??±???.
                inputStr = inputStr.toUpperCase();
                for (int i = 0; i < inputStr.length(); i++) {
                    temp = inputStr.charAt(i);
                    
                    int plusOne = 0;
                    switch (temp) {
                        case 'A':
                            plusOne = outputTreeMap.get("A").intValue() + 1;
                            outputTreeMap.put("A", plusOne);
                            break;
                        case 'B':
                            plusOne = outputTreeMap.get("B").intValue() + 1;
                            outputTreeMap.put("B", plusOne);
                            break;
                        case 'C':
                            plusOne = outputTreeMap.get("C").intValue() + 1;
                            outputTreeMap.put("C", plusOne);
                            break;
                        case 'D':
                            plusOne = outputTreeMap.get("D").intValue() + 1;
                            outputTreeMap.put("D", plusOne);
                            break;
                        case 'E':
                            plusOne = outputTreeMap.get("E").intValue() + 1;
                            outputTreeMap.put("E", plusOne);
                            break;
                        case 'F':
                            plusOne = outputTreeMap.get("F").intValue() + 1;
                            outputTreeMap.put("F", plusOne);
                            break;
                        case 'G':
                            plusOne = outputTreeMap.get("G").intValue() + 1;
                            outputTreeMap.put("G", plusOne);
                            break;
                        case 'H':
                            plusOne = outputTreeMap.get("H").intValue() + 1;
                            outputTreeMap.put("H", plusOne);
                            break;
                        case 'I':
                            plusOne = outputTreeMap.get("I").intValue() + 1;
                            outputTreeMap.put("I", plusOne);
                            break;
                        case 'J':
                            plusOne = outputTreeMap.get("J").intValue() + 1;
                            outputTreeMap.put("J", plusOne);
                            break;
                        case 'K':
                            plusOne = outputTreeMap.get("K").intValue() + 1;
                            outputTreeMap.put("K", plusOne);
                            break;
                        case 'L':
                            plusOne = outputTreeMap.get("L").intValue() + 1;
                            outputTreeMap.put("L", plusOne);
                            break;
                        case 'M':
                            plusOne = outputTreeMap.get("M").intValue() + 1;
                            outputTreeMap.put("M", plusOne);
                            break;
                        case 'N':
                            plusOne = outputTreeMap.get("N").intValue() + 1;
                            outputTreeMap.put("N", plusOne);
                            break;
                        case 'O':
                            plusOne = outputTreeMap.get("O").intValue() + 1;
                            outputTreeMap.put("O", plusOne);
                            break;
                        case 'P':
                            plusOne = outputTreeMap.get("P").intValue() + 1;
                            outputTreeMap.put("P", plusOne);
                            break;
                        case 'Q':
                            plusOne = outputTreeMap.get("Q").intValue() + 1;
                            outputTreeMap.put("Q", plusOne);
                            break;
                        case 'R':
                            plusOne = outputTreeMap.get("R").intValue() + 1;
                            outputTreeMap.put("R", plusOne);
                            break;
                        case 'S':
                            plusOne = outputTreeMap.get("S").intValue() + 1;
                            outputTreeMap.put("T", plusOne);
                            break;
                        case 'T':
                            plusOne = outputTreeMap.get("T").intValue() + 1;
                            outputTreeMap.put("T", plusOne);
                            break;
                        case 'U':
                            plusOne = outputTreeMap.get("U").intValue() + 1;
                            outputTreeMap.put("U", plusOne);
                            break;
                        case 'V':
                            plusOne = outputTreeMap.get("V").intValue() + 1;
                            outputTreeMap.put("V", plusOne);
                            break;
                        case 'W':
                            plusOne = outputTreeMap.get("W").intValue() + 1;
                            outputTreeMap.put("W", plusOne);
                            break;
                        case 'X':
                            plusOne = outputTreeMap.get("X").intValue() + 1;
                            outputTreeMap.put("X", plusOne);
                            break;
                        case 'Y':
                            plusOne = outputTreeMap.get("Y").intValue() + 1;
                            outputTreeMap.put("Y", plusOne);
                            break;
                        case 'Z':
                            plusOne = outputTreeMap.get("Z").intValue() + 1;
                            outputTreeMap.put("Z", plusOne);
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