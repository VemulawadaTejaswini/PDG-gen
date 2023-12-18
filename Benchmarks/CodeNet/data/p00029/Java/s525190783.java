import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                String longest = ""; 
                String often = ""; 
                int max = 0;
                Hashtable<String, Integer> list = new Hashtable<String, Integer>();
                while(sc.hasNext()){
                        String s = sc.next();
                        longest = longest.length() < s.length() ? s : longest;
                        if(list.containsKey(s)){
                                list.put(s, list.get(s)+1);
                        }else{
                                list.put(s, 1); 
                        }   
                        if(max < list.get(s)){
                                max = list.get(s);
                                often = s;
                        }   
                }   
                sc.close();
                System.out.println(often+" "+longest);

        }   
}