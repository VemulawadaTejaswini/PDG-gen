import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            String w;
            boolean even = true;
            Scanner input = new Scanner(System.in);
            w=input.nextLine();
            Map<Character,Integer> frq = new HashMap<>();
            for(int i=0;i<w.length();i++){
                if(frq.containsKey(w.charAt(i))){
                    frq.put(w.charAt(i),frq.get(w.charAt(i))+1);
                }
                else{
                    frq.put(w.charAt(i),1);
                }
            }
            for (Map.Entry<Character, Integer> entry : frq.entrySet()) {
                if(entry.getValue()%2!=0){
                    even = false;
                    break;
                }
            }
            if(even==true && w.length()!=0&&w.length()!=1) {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }

}