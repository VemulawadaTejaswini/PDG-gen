import java.util.*;

public class Main {
    public static int MAX = 1000001;
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        String line = sc.nextLine();
        
        while (TC-- > 0) {
            line = sc.nextLine();
            District d = new District(getDistrictSubstring(line), 0);
            System.out.println(d.getMinVotes());
        }
    }
    
    public static String getDistrictSubstring(String str) {
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == '[') {
                count++;
            }
            else if (str.charAt(i) == ']') {
                count--;
                if (count == 0) {
                    return str.substring(1, i);
                }
            }
        }
        return null;
    }
    
    public static class District {
        Vector<District> districts;
        boolean isBase;
        int num;
        int level;
        
        public District(String str, int level) {
            this.level = level;
            if (Character.isDigit(str.charAt(0))) {
                this.isBase = true;
                this.num = Integer.parseInt(str, 10);
            } else {
                this.isBase = false;
                districts = new Vector<District>();
                parseDistricts(str);
            }
        }
        
        public void parseDistricts(String str) {
            for (int i = 0; i < str.length(); ) {
                String temp = getDistrictSubstring(str.substring(i));
                districts.add(new District(temp, level + 1));
                i += temp.length() + 2;
            }
        }
        
        public int getMinVotes() {
            if (isBase) {
                return num / 2 + 1;
            }
            int sz = districts.size();
            int[] arr = new int[sz];
            for (int i = 0; i < sz; i++) {
                arr[i] = districts.get(i).getMinVotes();
            }
            Arrays.sort(arr);
            int total = 0;
            for (int i = 0; i < sz / 2 + 1; i++) {
                total += arr[i];
            }
            return total;
        }
    }
    
}


