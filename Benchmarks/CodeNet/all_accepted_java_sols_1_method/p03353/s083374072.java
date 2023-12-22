import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        char[] in = s.toCharArray();
        int count = 0;
        for (char c = 'a';c <= 'z';++c){
            ArrayList<String> subs1 = new ArrayList<>();
            for (int i = 0;i < in.length;++i){
                if(in[i] == c){
                    subs1.add(s.substring(i));
                }
            }
            Collections.sort(subs1);
            ArrayList<String> counted = new ArrayList<>();
            for (String ss:subs1){
                for (int i = 1;i <= ss.length();++i){
                    String kw = ss.substring(0,i);
                    if(!counted.contains(kw)){
                        counted.add(kw);
                        ++count;
                        if(count == k){
                            System.out.println(kw);
                            return;
                        }
                    }
                }
            }


        }
    }






}