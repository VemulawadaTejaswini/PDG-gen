import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n];
        for (int i = 0; i < n; i++) str[i] = sc.next();

        for (int i=0 ;i<n; i++){
            char c[] = str[i].toCharArray();
            Arrays.sort(c);
            str[i] = Arrays.toString(c);
        }

//        for (int i=0; i<n; i++)

        Map<String, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {

            if (map.containsKey(str[i])) {
                map.put(str[i], map.get(str[i]) + 1);
            } else {
                map.put(str[i], 1l);
            }
        }

        long sum = 0;
        for (long i: map.values()){
            sum += i*(i-1)/2;
        }
        System.out.print(sum);
//        System.out.print(str[0]);

    }
    }

//    public static boolean comp(char[] c1, char []c2){
//
//        Arrays.sort(c1);
//        Arrays.sort(c2);
//        if (Arrays.equals(c1, c2)){
//            return true;
//        }else{
//            return false;
//        }
//    }
//}