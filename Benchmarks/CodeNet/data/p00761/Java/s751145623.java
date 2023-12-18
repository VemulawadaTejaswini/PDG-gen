import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNextLine()) {
            int number = s.nextInt();
            int digits = s.nextInt();

            if(number == 0 && digits == 0) break;

            List<Integer> resultList = new LinkedList<Integer>();
            resultList.add(number);
            int result = exec(number, digits, resultList);
            System.out.println(String.valueOf(resultList.indexOf(result)) + " " + result + " " + String.valueOf(resultList.lastIndexOf(result) - resultList.indexOf(result)));
        }
    }

    private static int exec(int number, int digits, List<Integer> resultList){
        int result = sortNumber(number, digits, false) - sortNumber(number, digits, true);
        System.out.println(result);
        if(resultList.contains(result)){
            resultList.add(result);
            return result;
        } else {
            resultList.add(result);
            return exec(result, digits, resultList);
        }
    }

    private static int sortNumber(int targetNum, int digits, boolean isAsc){
        String targetNumStr = String.valueOf(targetNum);
        int length = targetNum == 0 ? 1 : (int)(Math.log10(targetNum)+1);
        for(int l = length; l < digits; l++){
            targetNumStr += "0";
        }

        List<String> list = new ArrayList<String>();

        for(int i = 0; i < targetNumStr.length(); i++){
            list.add(String.valueOf(targetNumStr.charAt(i)));
        }
        if(isAsc){
            Collections.sort(list, ASC);
        } else {
            Collections.sort(list, DESC);
        }
        String sortedNumStr = "";
        for(String s : list){
            sortedNumStr += s;
        }
        return Integer.valueOf(sortedNumStr);
    }

    private static Comparator<String> ASC = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            int res = String.CASE_INSENSITIVE_ORDER.compare(o1, o2);
            return (res != 0) ? res : o1.compareTo(o2);
        }
    };

    private static Comparator<String> DESC = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            int res = String.CASE_INSENSITIVE_ORDER.compare(o2, o1);
            return (res != 0) ? res : o1.compareTo(o2);
        }
    };

}