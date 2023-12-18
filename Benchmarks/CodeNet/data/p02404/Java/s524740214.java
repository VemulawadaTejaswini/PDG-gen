import java.io.*;
import java.util.Arrays;

/**
 * ??????H cm ?????? W cm ????????????????????????
 * 
 * e.g.?????? 6 cm ?????? 10 cm
 * ##########
 * #........#
 * #........#
 * #........#
 * #........#
 * ##########
 * 
 * @author ikaruga
 */
class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            br.lines().forEach(line -> System.out.println(getFrame(line.trim())));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param line
     *            ??????H ?????? W(e.g."4 5")
     * @return String
     */
    private static String getFrame(String line) {
    	String[] sizeArray = line.split("\\s");
    	if (sizeArray.length != 2) {
    		return "";
    	}
    	if (Arrays.asList(sizeArray).stream().allMatch(s -> s.equals("0"))) {
    		return "";
    	}
    	
    	int h = 0;
    	int w = 0;
    	int hh = Integer.parseInt(sizeArray[0]);
    	int ww = Integer.parseInt(sizeArray[1]);
    	StringBuilder sb = new StringBuilder();
    	for (h = 0; h < hh; h++) {
        	for (w = 0; w < ww; w++) {
        		if (w == 0) {
        			sb.append("#");
        		} else if (w == ww - 1) {
        			sb.append("#");
        			sb.append(System.lineSeparator());
        		} else if (h == 0 || h == hh - 1) {
        			sb.append("#");
        		} else {
        			sb.append(".");
        		}
        	}
    	}
        return sb.toString();
    }
}