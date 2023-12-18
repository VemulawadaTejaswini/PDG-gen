import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        initMaps();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = null;
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            String enc = encode(line);
            String result = decode(enc);
            out.println(result);
        }
    }

    private static String encode(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String code = encodeMap.get(ch);
            sb.append(code);
        }
        int r = sb.length() % 5;
        if (r != 0) {
            int pad = 5 - r;
            for (int i = 0; i < pad; i++) {
                sb.append("0");

            }
        }
        return sb.toString();
    }

    private static String decode(String enc) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < enc.length(); i += 5) {
            String code = enc.substring(i, i + 5);
            char ch = decodeMap.get(code);
            sb.append(ch);
        }
        return sb.toString();
    }

    private static Map<Character, String> encodeMap = new HashMap<Character, String>();

    private static Map<String, Character> decodeMap = new HashMap<String, Character>();

    private static void initMaps() {
        encodeMap.put(' ', "101");
        encodeMap.put('\'', "000000");
        encodeMap.put(',', "000011");
        encodeMap.put('-', "10010001");
        encodeMap.put('.', "010001");
        encodeMap.put('?', "000001");
        encodeMap.put('A', "100101");
        encodeMap.put('B', "10011010");
        encodeMap.put('C', "0101");
        encodeMap.put('D', "0001");
        encodeMap.put('E', "110");
        encodeMap.put('F', "01001");
        encodeMap.put('G', "10011011");
        encodeMap.put('H', "010000");
        encodeMap.put('I', "0111");
        encodeMap.put('J', "10011000");
        encodeMap.put('K', "0110");
        encodeMap.put('L', "00100");
        encodeMap.put('M', "10011001");
        encodeMap.put('N', "10011110");
        encodeMap.put('O', "00101");
        encodeMap.put('P', "111");
        encodeMap.put('Q', "10011111");
        encodeMap.put('R', "1000");
        encodeMap.put('S', "00110");
        encodeMap.put('T', "00111");
        encodeMap.put('U', "10011100");
        encodeMap.put('V', "10011101");
        encodeMap.put('W', "000010");
        encodeMap.put('X', "10010010");
        encodeMap.put('Y', "10010011");
        encodeMap.put('Z', "10010000");

        decodeMap.put("00000", 'A');
        decodeMap.put("00001", 'B');
        decodeMap.put("00010", 'C');
        decodeMap.put("00011", 'D');
        decodeMap.put("00100", 'E');
        decodeMap.put("00101", 'F');
        decodeMap.put("00110", 'G');
        decodeMap.put("00111", 'H');
        decodeMap.put("01000", 'I');
        decodeMap.put("01001", 'J');
        decodeMap.put("01010", 'K');
        decodeMap.put("01011", 'L');
        decodeMap.put("01100", 'M');
        decodeMap.put("01101", 'N');
        decodeMap.put("01110", 'O');
        decodeMap.put("01111", 'P');
        decodeMap.put("10000", 'Q');
        decodeMap.put("10001", 'R');
        decodeMap.put("10010", 'S');
        decodeMap.put("10011", 'T');
        decodeMap.put("10100", 'U');
        decodeMap.put("10101", 'V');
        decodeMap.put("10110", 'W');
        decodeMap.put("10111", 'X');
        decodeMap.put("11000", 'Y');
        decodeMap.put("11001", 'Z');
        decodeMap.put("11010", ' ');
        decodeMap.put("11011", '.');
        decodeMap.put("11100", ',');
        decodeMap.put("11101", '-');
        decodeMap.put("11110", '\'');
        decodeMap.put("11111", '?');
    }
}