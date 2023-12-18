import java.util.*;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> test_case = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n+1; i++) {
            test_case.add(sc.nextLine());
        }
        Map<String,Integer> sum = new HashMap<>();
        sum = solve(test_case);

        System.out.println("AC x " + sum.get("AC") + System.getProperty("line.separator")
                + "WA x " + sum.get("WA") + System.getProperty("line.separator")
                + "TLE x " + sum.get("TLE") + System.getProperty("line.separator")
                + "RE x " + sum.get("RE")
                );
    }

    public static Map<String,Integer> solve (ArrayList<String> test_case){
        Map<String,Integer> sum = new HashMap<>();
        int ac = 0;
        int tle = 0;
        int wa = 0;
        int re = 0;
        sum.put("AC", ac);
        sum.put("TLE", tle);
        sum.put("RE", re);
        sum.put("WA", wa);

        for (String test : test_case) {
            switch(test){
                case "AC":
                    ac++;
                    sum.put("AC",ac);
                    break;
                case "TLE":
                    tle++;
                    sum.put("TLE",tle);
                    break;
                case "WA":
                    wa++;
                    sum.put("WA",wa);
                    break;
                case "RE":
                    re++;
                    sum.put("RE",re);

            }
        }
        return sum;
    }

}