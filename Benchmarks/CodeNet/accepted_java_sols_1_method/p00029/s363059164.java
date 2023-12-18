import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


class Main {

        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] args) throws Exception{
            String[] words = reader.readLine().split(" ");
           
            HashMap<String, Integer> dist = new HashMap<String, Integer>();
            String longest = ""; 

            for (int i=0; i<words.length; i++) {
                if (dist.containsKey(words[i])) {
                    dist.put(words[i], dist.get(words[i]) + 1);
                } else {
                    dist.put(words[i], 1);
                }

                if (words[i].length() > longest.length())
                    longest = words[i];
            }

            int max_dist = -1;
            String max_word = ""; 
            for (String key : dist.keySet()) {
                if (max_dist < dist.get(key)) {
                    max_word = key;
                    max_dist = dist.get(key);   
                }
            }

            System.out.println(max_word + " " + longest);
            
        }

}