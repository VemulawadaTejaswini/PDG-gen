import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        Set<String> results = new HashSet<>();
        for(int i = 0 ; i < 1000 ; i++){
            String v = String.valueOf(i);
            if(i < 10){
                v = "00" + v;
            }else if(i < 100){
                v = "0" + v;
            }

            String s1 = s;
            int index1 = s1.indexOf(v.charAt(0));
            if(index1 < 0){
                continue;
            }
            String s2 = s1.substring(index1 + 1);
            int index2 = s2.indexOf(v.charAt(1));
            if(index2 < 0){
                continue;
            }
            String s3 = s2.substring(index2 + 1);
            int index3 = s3.indexOf(v.charAt(2));
            if(index3 < 0){
                continue;
            }
            results.add(v);
        }
        System.out.println(results.size());
    }

}
