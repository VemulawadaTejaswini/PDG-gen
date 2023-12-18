import java.util.*;

 
class Main {
 
    private static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        String s = sc.next();
        //String s2 = sc.next();
        //int x =Integer.parseInt(s);
        String ans="";
        if(s.equals("A")){
            ans="T";
        }else if(s.equals("T")){
            ans="A";
        }else if(s.equals("C")){
            ans="G";
        }else{
            ans="C";
        }
        //String s = String.valueOf(i);
        //int i = Integer.parseInt(s);
        //System.out.println((s + s).contains(s2) ? "Yes" : "No");
        System.out.println(ans);
        /*
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                int h = Integer.parseInt(tokens[0]);
                int w = Integer.parseInt(tokens[1]);
                
                }
            }
        }
        */
        
    }
}
