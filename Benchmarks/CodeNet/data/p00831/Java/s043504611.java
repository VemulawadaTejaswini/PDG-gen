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

            Arrays.sort(s);

            for(int i=0;i<n;i++){
                delChar(s[i]);
                insChar(s[i]);
                repChar(s[i]);
                swapChar(s[i]);
            }

            int cnt = 0;
            TreeSet<SS> ans = new TreeSet<SS>();

            for(int i=0;i<n;i++){
                if(!map.containsKey(s[i])) continue;
                ArrayList<String> al = new ArrayList<String>(map.get(s[i]));
                for(int j=0;j<al.size();j++){
                    if(s[i].equals(al.get(j))) continue;
                    ans.add(new SS(s[i],al.get(j)));
                }
                map.remove(s[i]);
            }

            if(d == 2){
                for(String ss : map.keySet()){
                    ArrayList<String> al = new ArrayList<String>(map.get(ss));
                    for(int j=0;j<al.size();j++){
                        for(int k=j+1;k<al.size();k++){
                            ans.add(new SS(al.get(j),al.get(k)));
                        }
                    }
                }
            }

            for(SS ss : ans){
                System.out.println(ss.a + "," + ss.b);
            }
            System.out.println(ans.size());
        }
    }
}

class SS implements Comparable<SS>{
    String a,b;

    public SS(String a,String b){
        if(a.compareTo(b) < 0){
            this.a = a;
            this.b = b;
        }
        else{
            this.a = b;
            this.b = a;
        }
    }

    public int compareTo(SS s){
        if(a.equals(s.a)){
            return b.compareTo(s.b);
        }
        return a.compareTo(s.a);
    }

    public boolean equals(SS s){
        return this.a.equals(s.a) && this.b.equals(s.b);
    }

    public int hashCode(){
        return a.hashCode() * b.hashCode(); 
    }
}