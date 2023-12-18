import java.util.*;

public class Main{
    static HashMap<String,HashSet<String>> map;

    public static void delChar(String s){
        int n = s.length();

        for(int i=0;i<n;i++){
            String ss = s.substring(0,i) + s.substring(i+1);
            if(!map.containsKey(ss)) map.put(ss,new HashSet<String>());
            map.get(ss).add(s);
        }
    }

    public static void insChar(String s){
        int n = s.length();

        for(int i=0;i<=n;i++){
            for(int j=0;j<26;j++){
                String ss = s.substring(0,i) + (char)('a' + j) + s.substring(i);
                if(!map.containsKey(ss)) map.put(ss,new HashSet<String>());
                map.get(ss).add(s);
            }
        }
    }

    public static void repChar(String s){
        int n = s.length();

        for(int i=0;i<n;i++){
            for(int j=0;j<26;j++){
                String ss = s.substring(0,i) + (char)('a' + j) + s.substring(i+1);
                if(!map.containsKey(ss)) map.put(ss,new HashSet<String>());
                map.get(ss).add(s);
            }
        }
    }

    public static void swapChar(String s){
        int n = s.length();

        for(int i=0;i<n-1;i++){
            String ss = s.substring(0,i) + s.charAt(i+1) + s.charAt(i) + s.substring(i+2);
            if(!map.containsKey(ss)) map.put(ss,new HashSet<String>());
            map.get(ss).add(s);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n == 0) break;

            int d = sc.nextInt();
            String[] s = new String[n];

            for(int i=0;i<n;i++){
                s[i] = sc.next();
            }

            map = new HashMap<String,HashSet<String>>();

            /*
            swapChar("xy");
            System.out.println(map);
            */
            for(int i=0;i<n;i++){
                delChar(s[i]);
                insChar(s[i]);
                repChar(s[i]);
                swapChar(s[i]);
            }

            Arrays.sort(s);

            int cnt = 0;

            for(int i=0;i<n;i++){
                TreeSet<String> set = new TreeSet<String>();
                if(map.containsKey(s[i])) set.addAll(map.get(s[i]));
                for(String ss : map.keySet()){
                    if(map.get(ss).contains(s[i])){
                        set.addAll(map.get(ss));
                    }
                }

                for(String ss : set){
                    if(s[i].compareTo(ss) < 0){
                        cnt++;
                        System.out.println(s[i]+","+ss);
                    }
                }
            }

            System.out.println(cnt);
        }
    }
}